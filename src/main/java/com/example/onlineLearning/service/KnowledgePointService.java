package com.example.onlineLearning.service;

import com.example.onlineLearning.models.KnowledgePointCreation;
import com.example.onlineLearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/11/14:13
 * @Description: 致敬
 */
public interface KnowledgePointService {
    ServiceResponse<Boolean> createKnowledgePoint(KnowledgePointCreation knowledgePointCreation);
}
