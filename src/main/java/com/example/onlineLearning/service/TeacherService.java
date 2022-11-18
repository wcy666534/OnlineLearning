package com.example.onlineLearning.service;

import com.example.onlineLearning.domain.Teacher;
import com.example.onlineLearning.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/11/18/16:19
 * @Description: 致敬
 */
public interface TeacherService {
    ServiceResponse<Boolean> create( Teacher teacher);
}
