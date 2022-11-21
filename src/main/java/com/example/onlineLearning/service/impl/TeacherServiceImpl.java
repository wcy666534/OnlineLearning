package com.example.onlineLearning.service.impl;

import com.example.onlineLearning.dao.TeacherMapper;
import com.example.onlineLearning.domain.Teacher;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/18/16:19
 * @Description: 致敬
 */
@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public ServiceResponse<Boolean> create(Teacher teacher) {
        log.info("teacher="+teacher);
        //参数验证后面补
        try {
            int insertSuccessCount= teacherMapper.insert(teacher);
            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            }else {
                return ServiceResponse.buildErrorResponse(1, "Error when insert teacher.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1,"Error when insert teacher.");
        }
    }
}
