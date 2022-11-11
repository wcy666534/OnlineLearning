package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.Label;
import java.util.List;

public interface LabelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Label row);

    Label selectByPrimaryKey(Long id);

    List<Label> selectAll();

    int updateByPrimaryKey(Label row);
}