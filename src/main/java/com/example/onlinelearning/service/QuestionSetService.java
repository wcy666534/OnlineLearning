package com.example.onlinelearning.service;

import com.example.onlinelearning.models.QuestionSetCreation;
import com.example.onlinelearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/11/9:54
 * @Description: 致敬
 */
public interface QuestionSetService {
    ServiceResponse<Boolean> createQuestionSet(QuestionSetCreation questionSetCreation);

}
