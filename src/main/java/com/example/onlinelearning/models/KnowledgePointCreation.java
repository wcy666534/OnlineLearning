package com.example.onlinelearning.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/11/11/14:17
 * @Description: 致敬
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class KnowledgePointCreation {
    private Long id;
    private Long disciplineId;
    private String name;
    private String descriptionUrl;
    private Long creatorId;
    private Long preKnowledgePoint[];
}
