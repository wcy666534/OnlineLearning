package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.Label;
import java.util.List;

public interface LabelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Label row);

    Label selectByPrimaryKey(Long id);

    List<Label> selectAll();

    int updateByPrimaryKey(Label row);
}