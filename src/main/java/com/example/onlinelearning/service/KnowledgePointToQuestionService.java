package com.example.onlinelearning.service;

import com.example.onlinelearning.domain.KnowledgePointToQuestion;
import com.example.onlinelearning.models.ServiceResponse;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: 作者
 * @Date: 2022/11/11/15:27
 * @Description: 致敬
 */
public interface KnowledgePointToQuestionService {
    ServiceResponse<Boolean> createKnowledgePointToQuestion(KnowledgePointToQuestion knowledgePointToQuestion);
}
