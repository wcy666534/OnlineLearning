package com.example.onlinelearning.service.serviceImpl;

import com.example.onlinelearning.dao.CreatorMapper;
import com.example.onlinelearning.dao.QuestionMapper;
import com.example.onlinelearning.dao.QuestionSetMapper;
import com.example.onlinelearning.dao.QuestionSetToQuestionMapper;
import com.example.onlinelearning.domain.QuestionSet;
import com.example.onlinelearning.domain.QuestionSetToQuestion;
import com.example.onlinelearning.models.QuestionSetCreation;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.QuestionSetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/11/9:56
 * @Description: 致敬
 */
@Service
@Slf4j
public class QuestionSetServiceImpl implements QuestionSetService {
    @Autowired
    private QuestionSetMapper questionSetMapper;
    @Autowired
    private QuestionSetToQuestionMapper questionSetToQuestionMapper;
    @Autowired
    private CreatorMapper creatorMapper;
    @Autowired
    private QuestionMapper questionMapper;

    public ServiceResponse<Boolean> createQuestionSet(QuestionSetCreation questionSetCreation) {
        log.info("questionSetCreation=" + questionSetCreation);
        /*  参数检查*/
        //检查creatorId是否存在
        if (creatorMapper.selectByPrimaryKey(questionSetCreation.getCreatorId()) == null) {
            System.err.println("creator is not exist");
            return ServiceResponse.buildErrorResponse(1, "creator is not exist");
        }
        //檢查questionId是否存在及disciplineId是否相同
        Long questionId[] = questionSetCreation.getQuestionId();
        Boolean flag = true;
        Long disciplineId = Long.valueOf(0);
        for (int i = 0; i < questionId.length; i++) {
            if (questionMapper.selectByPrimaryKey(questionId[i]) == null) {
                flag = false;
            }
            if (flag == true) {
                if (i == 0) {
                    disciplineId = questionMapper.selectByPrimaryKey(questionId[i]).getDisciplineId();
                } else {
                    if (disciplineId != questionMapper.selectByPrimaryKey(questionId[i]).getDisciplineId()) {
                        flag = false;
                    }
                }
            }
        }
        if (flag == false) {
            System.err.println("question is not exist or disciplineId is inconsistency");
            return ServiceResponse.buildErrorResponse(1, "question is not exist or disciplineId is inconsistency");
        }
        try {
            QuestionSet questionSet = new QuestionSet(questionSetCreation.getId(), questionSetCreation.getName(), questionSetCreation.getDescription(),
                    questionSetCreation.getDisciplineId(), questionSetCreation.getCreatorId());
            int insertSuccessCount = questionSetMapper.insert(questionSet);
            for (int i = 0; i < questionId.length; i++) {
                QuestionSetToQuestion questionSetToQuestion = new QuestionSetToQuestion(questionSetCreation.getId(), questionId[i]);
                questionSetToQuestionMapper.insert(questionSetToQuestion);
            }
            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when insert question set");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when insert question set");
        }
    }
}
