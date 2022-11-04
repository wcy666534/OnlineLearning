package com.example.onlinelearning.service.serviceImpl;

import com.example.onlinelearning.dao.QuestionBaseInfoMapper;
import com.example.onlinelearning.domain.QuestionBaseInfo;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/03/16:59
 * @Description: 致敬
 */
@Slf4j
@Service
public class QuestionServiceImpl implements QuestionService {
    //不知道为什么这里要改成false
    @Autowired
    private QuestionBaseInfoMapper questionBaseInfoMapper;

    public ServiceResponse<Boolean> createQuestion(QuestionBaseInfo questionBadeInfo) {
        log.info("questionBadeInfo" + questionBadeInfo);
        try {
            int successCount = questionBaseInfoMapper.insert(questionBadeInfo);
            if (successCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when question insert.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(2, "Error when question insert.");
        }
    }
}