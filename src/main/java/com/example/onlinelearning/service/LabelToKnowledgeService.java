package com.example.onlinelearning.service;

import com.example.onlinelearning.domain.LabelToKnowledge;
import com.example.onlinelearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:21
 * @Description: 致敬
 */
public interface LabelToKnowledgeService {
    ServiceResponse<Boolean> createLabelToKnowledge(LabelToKnowledge labelToKnowledge);
}
