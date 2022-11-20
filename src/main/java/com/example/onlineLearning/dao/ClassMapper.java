package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.Class;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Class row);

    Class selectByPrimaryKey(Long id);

    List<Class> selectAll();

    int updateByPrimaryKey(Class row);
}