package com.example.onlineLearning.domain;

import java.util.Date;

public class Question {
    private Long id;

    private String questionBodyUrl;

    private String answerBodyUrl;

    private Long disciplineId;

    private Integer sourceTypeId;

    private Integer difficultyTypeId;

    private Integer questionTypeId;

    private Integer estimatedTimeToFinish;

    private Long creatorId;

    private Date creationTime;

    private Long updateOperatorId;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionBodyUrl() {
        return questionBodyUrl;
    }

    public void setQuestionBodyUrl(String questionBodyUrl) {
        this.questionBodyUrl = questionBodyUrl == null ? null : questionBodyUrl.trim();
    }

    public String getAnswerBodyUrl() {
        return answerBodyUrl;
    }

    public void setAnswerBodyUrl(String answerBodyUrl) {
        this.answerBodyUrl = answerBodyUrl == null ? null : answerBodyUrl.trim();
    }

    public Long getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Long disciplineId) {
        this.disciplineId = disciplineId;
    }

    public Integer getSourceTypeId() {
        return sourceTypeId;
    }

    public void setSourceTypeId(Integer sourceTypeId) {
        this.sourceTypeId = sourceTypeId;
    }

    public Integer getDifficultyTypeId() {
        return difficultyTypeId;
    }

    public void setDifficultyTypeId(Integer difficultyTypeId) {
        this.difficultyTypeId = difficultyTypeId;
    }

    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public Integer getEstimatedTimeToFinish() {
        return estimatedTimeToFinish;
    }

    public void setEstimatedTimeToFinish(Integer estimatedTimeToFinish) {
        this.estimatedTimeToFinish = estimatedTimeToFinish;
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