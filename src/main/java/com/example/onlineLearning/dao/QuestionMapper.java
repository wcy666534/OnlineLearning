package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.Question;
import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Question row);

    Question selectByPrimaryKey(Long id);

    List<Question> selectAll();

    int updateByPrimaryKey(Question row);
}