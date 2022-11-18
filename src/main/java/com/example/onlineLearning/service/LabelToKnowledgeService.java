package com.example.onlineLearning.service;

import com.example.onlineLearning.domain.LabelToKnowledge;
import com.example.onlineLearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:21
 * @Description: 致敬
 */
public interface LabelToKnowledgeService {
    ServiceResponse<Boolean> createLabelToKnowledge(LabelToKnowledge labelToKnowledge);
}
