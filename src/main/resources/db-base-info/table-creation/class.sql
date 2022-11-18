CREATE TABLE `class`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the class.',
    `major_id`           BIGINT                                                  DEFAULT 0 COMMENT 'Major id of the class.',
    `start_date`         DATE                                           NOT NULL COMMENT 'Start date of the class.',
    `end_date`           DATE                                           NOT NULL COMMENT 'End date of the class.',
    `creator_id`         BIGINT                                         NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the class.',
    `update_operator_id` BIGINT                                         NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                       NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_major_id` (`major_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of class.';