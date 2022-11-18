package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.Creator;
import java.util.List;

public interface CreatorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Creator row);

    Creator selectByPrimaryKey(Long id);

    List<Creator> selectAll();

    int updateByPrimaryKey(Creator row);
}