package com.example.onlinelearning.service;

import com.example.onlinelearning.domain.QuestionBaseInfo;
import com.example.onlinelearning.models.ServiceResponse;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/03/16:58
 * @Description: 致敬
 */
public interface QuestionService {
     ServiceResponse<Boolean> createQuestion(QuestionBaseInfo questionBadeInfo);
}
