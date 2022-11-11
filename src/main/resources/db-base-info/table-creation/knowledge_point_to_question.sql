CREATE TABLE `knowledge_point_to_question`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `knowledge_point_id`        BIGINT  NOT NULL COMMENT 'ID of the knowledge point.',
    `question_id`        BIGINT  NOT NULL COMMENT 'ID of the question.',
    `creator_id`        bigint   NOT NULL COMMENT ' ID of the creator.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Record the correspondence between knowledge_point_id and question_id.';