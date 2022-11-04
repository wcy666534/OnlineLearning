package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.QuestionBaseInfo;
import org.springframework.stereotype.Repository;

/**
 * @Author: 作者
 * @Date: 2022/11/03/16:57
 * @Description: 致敬
 */
@Repository
public interface QuestionBaseInfoMapper {
    int insert(QuestionBaseInfo questionBaseInfo);
}
