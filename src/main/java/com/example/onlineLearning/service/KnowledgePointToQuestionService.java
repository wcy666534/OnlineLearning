package com.example.onlineLearning.service;

import com.example.onlineLearning.domain.KnowledgePointToQuestion;
import com.example.onlineLearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/11/15:27
 * @Description: 致敬
 */
public interface KnowledgePointToQuestionService {
    ServiceResponse<Boolean> createKnowledgePointToQuestion(KnowledgePointToQuestion knowledgePointToQuestion);
}
