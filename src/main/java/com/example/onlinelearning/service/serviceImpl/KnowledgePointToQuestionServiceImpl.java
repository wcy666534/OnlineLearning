package com.example.onlinelearning.service.serviceImpl;

import com.example.onlinelearning.dao.CreatorMapper;
import com.example.onlinelearning.dao.KnowledgePointMapper;
import com.example.onlinelearning.dao.KnowledgePointToQuestionMapper;
import com.example.onlinelearning.dao.QuestionMapper;
import com.example.onlinelearning.domain.KnowledgePointToQuestion;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.KnowledgePointToQuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/11/15:28
 * @Description: 致敬
 */
@Service
@Slf4j
public class KnowledgePointToQuestionServiceImpl implements KnowledgePointToQuestionService {
    @Autowired
    private KnowledgePointToQuestionMapper knowledgePointToQuestionMapper;
    @Autowired
    private KnowledgePointMapper knowledgePointMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private CreatorMapper creatorMapper;

    public ServiceResponse<Boolean> createKnowledgePointToQuestion(KnowledgePointToQuestion knowledgePointToQuestion) {

        log.info("knowledgePointToQuestion=" + knowledgePointToQuestion);
        /*参数检查*/
        //检查creatorId是否存在
        if (creatorMapper.selectByPrimaryKey(knowledgePointToQuestion.getCreatorId()) == null) {
            System.err.println("creator is not exist");
            return ServiceResponse.buildErrorResponse(1, "creator is not exist");
        }
        //檢查questionId是否存在
        if (questionMapper.selectByPrimaryKey(knowledgePointToQuestion.getQuestionId()) == null) {
            System.err.println("questionId is not exist");
            return ServiceResponse.buildErrorResponse(1, "questionId is not exist");

        }
        //檢查knowledgePointId是否存在
        if (knowledgePointMapper.selectByPrimaryKey(knowledgePointToQuestion.getKnowledgePointId()) == null) {
            System.err.println("knowledgePointId is not exist");
            return ServiceResponse.buildErrorResponse(1, "knowledgePointId is not exist");

        }

        try {
            int insertSuccessCount = knowledgePointToQuestionMapper.insert(knowledgePointToQuestion);
            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when insert knowledge point to question");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when insert knowledge point to question");
        }
    }
}
