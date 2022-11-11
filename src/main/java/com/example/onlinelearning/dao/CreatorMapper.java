package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.Creator;
import java.util.List;

public interface CreatorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Creator row);

    Creator selectByPrimaryKey(Long id);

    List<Creator> selectAll();

    int updateByPrimaryKey(Creator row);
}