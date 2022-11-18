package com.example.onlineLearning.service.serviceImpl;

import com.example.onlineLearning.dao.ClassMapper;
import com.example.onlineLearning.domain.Class;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.ClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/18/16:50
 * @Description: 致敬
 */
@Slf4j
@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
     private ClassMapper classMapper;
     public ServiceResponse<Boolean> create(Class c){
         log.info("class="+c);
         //参数验证后面补
         try {
             int insertSuccessCount=classMapper.insert(c);
             if(insertSuccessCount>0){
                 return ServiceResponse.buildSuccessResponse(true);
             }else {
                 return ServiceResponse.buildErrorResponse(1, "Error when insert class.");
             }
         } catch (Exception e) {
             log.error("Error when executing SQL: ", e);
             return ServiceResponse.buildErrorResponse(1, "Error when insert class.");
         }
     }
}
