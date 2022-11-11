package com.example.onlinelearning.service;

import com.example.onlinelearning.domain.Label;
import com.example.onlinelearning.models.ServiceResponse;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:04
 * @Description: 致敬
 */
public interface LabelService {
   ServiceResponse<Boolean> createLabel(Label label);
}
