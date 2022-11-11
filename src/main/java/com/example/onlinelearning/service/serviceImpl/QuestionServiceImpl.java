package com.example.onlinelearning.service.serviceImpl;

import com.example.onlinelearning.dao.CreatorMapper;
import com.example.onlinelearning.dao.DisciplineMapper;
import com.example.onlinelearning.dao.QuestionMapper;
import com.example.onlinelearning.domain.Question;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: 作者
 * @Date: 2022/11/08/10:40
 * @Description: 致敬
 */
@Service
@Slf4j
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private DisciplineMapper disciplineMapper;
    @Autowired
    private CreatorMapper creatorMapper;

    public ServiceResponse<Boolean> createQuestion(Question question) {
        log.info("question=" + question);
        /*  参数检查*/
        //检查sourceTypeId是否为0或1
        if (question.getSourceTypeId() != 0 && question.getSourceTypeId() != 1) {
            System.err.println("SourceTypeId is error");
            return ServiceResponse.buildErrorResponse(1, "SourceTypeId is error");
        }


        //检查difficultyTypeId是否为0,1,2
        if (question.getDifficultyTypeId() != 0 && question.getDifficultyTypeId() != 1 && question.getDifficultyTypeId() != 2) {
            System.err.println("DifficultyTypeId is error");
            return ServiceResponse.buildErrorResponse(1, "DifficultyTypeId is error");
        }
        //检查questionTypeId是否为0,1,2,3
        Boolean flag = false;
        List<Integer> questionTypeIdList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3));
        for (int i = 0; i < questionTypeIdList.size(); i++) {
            if (question.getQuestionTypeId() == questionTypeIdList.get(i)) {
                flag = true;
            }
        }
        if (flag == false) {
            System.err.println("questionTypeId is error");
            return ServiceResponse.buildErrorResponse(1, "questionTypeId is error");
        }
        //检查creatorId是否存在
        if (creatorMapper.selectByPrimaryKey(question.getCreatorId()) == null) {
            System.err.println("creator is not exist");
            return ServiceResponse.buildErrorResponse(1, "creator is not exist");
        }
        //disciplineId是否存在discipline表里
        if (disciplineMapper.selectByPrimaryKey(question.getDisciplineId()).equals(null)) {
            System.err.println("disciplineId is not exist");
            return ServiceResponse.buildErrorResponse(1, "disciplineId is not exist");
        }
        try {
            int insertSuccessCount = questionMapper.insert(question);
            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when insert question");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when insert question");
        }
    }

}
