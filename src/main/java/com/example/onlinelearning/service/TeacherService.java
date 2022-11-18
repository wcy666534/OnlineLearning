package com.example.onlinelearning.service;

import com.example.onlinelearning.domain.Teacher;
import com.example.onlinelearning.models.ServiceResponse;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: 作者
 * @Date: 2022/11/18/16:19
 * @Description: 致敬
 */
public interface TeacherService {
    ServiceResponse<Boolean> create( Teacher teacher);
}
