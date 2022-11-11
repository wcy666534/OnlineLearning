package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.Question;
import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Question row);

    Question selectByPrimaryKey(Long id);

    List<Question> selectAll();

    int updateByPrimaryKey(Question row);
}