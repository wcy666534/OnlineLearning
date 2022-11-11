package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.QuestionSetToQuestion;
import java.util.List;

public interface QuestionSetToQuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionSetToQuestion row);

    QuestionSetToQuestion selectByPrimaryKey(Long id);

    List<QuestionSetToQuestion> selectAll();

    int updateByPrimaryKey(QuestionSetToQuestion row);
}