package com.example.onlinelearning.service;

import com.example.onlinelearning.domain.Question;
import com.example.onlinelearning.models.KnowledgePointCreation;
import com.example.onlinelearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/11/14:13
 * @Description: 致敬
 */
public interface KnowledgePointService {
    ServiceResponse<Boolean> createKnowledgePoint(KnowledgePointCreation knowledgePointCreation);
}
