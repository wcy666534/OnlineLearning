package com.example.onlinelearning.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/11/03/16:54
 * @Description: 致敬
 */
/*          `id`  BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
            `question_body_url`        VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'URL of the question body.',
            `answer_body_url`          VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'URL of the answer body of the question.',
            `source_type_id`           INT      NOT NULL COMMENT 'Source type of the question, 0-reprint, 1-original',
            `difficulty_type_id`       BIGINT   NOT NULL COMMENT 'ID of the difficulty of the question',
            `discipline_id`            BIGINT   NOT NULL COMMENT 'ID of the discipline that the question belongs to.',
            `question_type_id`         BIGINT   NOT NULL COMMENT 'ID of the question type.',
            `estimated_time_to_finish` INT      NOT NULL COMMENT 'Estimated time to finish the question, unit: seconds.',
            `creator_id`               BIGINT   NOT NULL COMMENT 'ID of the creator.',
            `creation_time`            DATETIME NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
            `update_operator_id`       BIGINT   NOT NULL COMMENT 'ID of the account of last update.',
            `update_time`              DATETIME NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',*/
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
public class Question {
    private long id ;
    private String questionBodyUrl;
    private String answerBodyUrl;
    private long disciplineId;
    private long sourceTypeId;
    private long difficultyTypeId;
    private long questionTypeId;
    private int estimatedTimeToFinish;
    private long creatorId;
    private long updateOperatorId;
}
