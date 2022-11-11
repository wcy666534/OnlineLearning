package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.QuestionSet;
import java.util.List;

public interface QuestionSetMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionSet row);

    QuestionSet selectByPrimaryKey(Long id);

    List<QuestionSet> selectAll();

    int updateByPrimaryKey(QuestionSet row);
}