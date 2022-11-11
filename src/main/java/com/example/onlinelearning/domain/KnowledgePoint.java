package com.example.onlinelearning.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
public class KnowledgePoint {
    private Long id;

    private Long disciplineId;

    private String name;

    private String descriptionUrl;

    private Long creatorId;

    private Date creationTime;

    private Long updateOperatorId;

    private Date updateTime;

    public KnowledgePoint(Long id, Long disciplineId, String name, String descriptionUrl, Long creatorId) {
        this.id = id;
        this.disciplineId = disciplineId;
        this.name = name;
        this.descriptionUrl = descriptionUrl;
        this.creatorId = creatorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Long disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescriptionUrl() {
        return descriptionUrl;
    }

    public void setDescriptionUrl(String descriptionUrl) {
        this.descriptionUrl = descriptionUrl == null ? null : descriptionUrl.trim();
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Long getUpdateOperatorId() {
        return updateOperatorId;
    }

    public void setUpdateOperatorId(Long updateOperatorId) {
        this.updateOperatorId = updateOperatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}