CREATE TABLE `question_set_to_question`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `question_set_id`              BIGINT  NOT NULL COMMENT 'ID of the question_set.',
    `question_id`        BIGINT  NOT NULL COMMENT 'ID of the question.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Record the correspondence between question_set and question.';