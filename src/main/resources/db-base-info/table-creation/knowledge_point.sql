CREATE TABLE `knowledge_point`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `discipline_id`      BIGINT                                         NOT NULL COMMENT 'ID of the discipline that the knowledge point belongs to.',
    `name`               VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the knowledge point.',
    `description_url`    VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'URL of the description of the knowledge point.',
#     `grade_id`           BIGINT                                         NOT NULL COMMENT 'ID of the grade when students learn the knowledge point.',
#     `semester_id`        BIGINT                                         NOT NULL COMMENT 'ID of the semester when students learn the knowledge point.',
#     `frequency_of_exams` DOUBLE                                         NOT NULL COMMENT 'Frequency of the knowledge appear in exams.',
    `creator_id`         BIGINT                                         NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id` BIGINT                                         NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                       NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_discipline_id` (`discipline_id`)
#     KEY `idx_grade_semester` (`grade_id`, `semester_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of knowledge point.';