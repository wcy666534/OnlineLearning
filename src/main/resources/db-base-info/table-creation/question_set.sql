CREATE TABLE `question_set`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the homework.',
    `description`        VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Description of the homework.',
    `discipline_id`      BIGINT                                         NOT NULL COMMENT 'ID of the discipline that the homework belongs to',
    `creator_id`         BIGINT                                         NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id` BIGINT                                         NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                       NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_discipline_id` (`discipline_id`),
    KEY `idx_creator_id` (`creator_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of question set (like homework or test paper).';