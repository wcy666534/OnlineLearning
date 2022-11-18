package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.Class;
import java.util.List;

public interface ClassMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Class row);

    Class selectByPrimaryKey(Long id);

    List<Class> selectAll();

    int updateByPrimaryKey(Class row);
}