package com.example.onlineLearning.service;

import com.example.onlineLearning.domain.Class;
import com.example.onlineLearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/18/17:09
 * @Description: 致敬
 */
public interface ClassService {
    ServiceResponse<Boolean> create( Class c);
}
