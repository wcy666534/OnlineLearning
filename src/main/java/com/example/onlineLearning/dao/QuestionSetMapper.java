package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.QuestionSet;
import java.util.List;

public interface QuestionSetMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionSet row);

    QuestionSet selectByPrimaryKey(Long id);

    List<QuestionSet> selectAll();

    int updateByPrimaryKey(QuestionSet row);
}