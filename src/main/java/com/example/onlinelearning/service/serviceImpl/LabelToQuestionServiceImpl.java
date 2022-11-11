package com.example.onlinelearning.service.serviceImpl;

import com.example.onlinelearning.dao.LabelMapper;
import com.example.onlinelearning.dao.LabelToQuestionMapper;
import com.example.onlinelearning.dao.QuestionMapper;
import com.example.onlinelearning.domain.LabelToQuestion;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.LabelToQuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:19
 * @Description: 致敬
 */
@Service
@Slf4j
public class LabelToQuestionServiceImpl implements LabelToQuestionService {
    @Autowired
    private LabelToQuestionMapper labelToQuestionMapper;
    @Autowired
    private LabelMapper labelMapper;
    @Autowired
    private QuestionMapper questionMapper;

    public ServiceResponse<Boolean> createLabelToQuestion(LabelToQuestion labelToQuestion) {
        log.info("labelToQuestion=" + labelToQuestion);
        /*参数检查*/
        //检查labelId是否存在
        if (labelMapper.selectByPrimaryKey(labelToQuestion.getLabelId()) == null) {
            System.err.println("labelId is not exist");
            return ServiceResponse.buildErrorResponse(1, "labelId is not exist");
        }
        //檢查questionId是否存在
        if (questionMapper.selectByPrimaryKey(labelToQuestion.getQuestionId()) == null) {
            System.err.println("questionId is not exist");
            return ServiceResponse.buildErrorResponse(1, "questionId is not exist");
        }

        try {
            int insertSuccessCount = labelToQuestionMapper.insert(labelToQuestion);
            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when insert labelToQuestion");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when insert labelToQuestion");
        }
    }
}