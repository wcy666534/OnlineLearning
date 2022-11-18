package com.example.onlineLearning.service;

import com.example.onlineLearning.domain.Question;
import com.example.onlineLearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/08/10:39
 * @Description: 致敬
 */

public interface QuestionService {
    ServiceResponse<Boolean> createQuestion(Question question);
}
