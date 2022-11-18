package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.QuestionSetToQuestion;
import java.util.List;

public interface QuestionSetToQuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionSetToQuestion row);

    QuestionSetToQuestion selectByPrimaryKey(Long id);

    List<QuestionSetToQuestion> selectAll();

    int updateByPrimaryKey(QuestionSetToQuestion row);
}