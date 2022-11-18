package com.example.onlineLearning.service;

import com.example.onlineLearning.domain.LabelToQuestion;
import com.example.onlineLearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:18
 * @Description: 致敬
 */
public interface LabelToQuestionService {
    ServiceResponse<Boolean> createLabelToQuestion(LabelToQuestion labelToQuestion);

    }
