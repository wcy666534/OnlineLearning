package com.example.onlineLearning.service;

import com.example.onlineLearning.domain.Label;
import com.example.onlineLearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:04
 * @Description: 致敬
 */
public interface LabelService {
    ServiceResponse<Boolean> createLabel(Label label);
}
