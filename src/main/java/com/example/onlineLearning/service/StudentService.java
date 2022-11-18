package com.example.onlineLearning.service;

import com.example.onlineLearning.models.ServiceResponse;

import java.io.InputStream;

/**
 * @Author: 作者
 * @Date: 2022/11/18/18:02
 * @Description: 致敬
 */
public interface StudentService {
    ServiceResponse<Boolean> importStudentData(InputStream inputStream, String originalFilename);
}
