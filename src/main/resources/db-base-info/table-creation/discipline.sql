CREATE TABLE `discipline`
(
    `id`                   BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`                 VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the discipline.',
    `description`          VARCHAR(500) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Description of the discipline.',
    `parent_discipline_id` BIGINT                                                  DEFAULT -1 COMMENT 'ID of parent discipline of this discipline.',
    `level`                INT                                            NOT NULL COMMENT 'Level of the discipline.',
    `creator_id`           BIGINT                                         NOT NULL COMMENT 'ID of the creator.',
    `creation_time`        DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id`   BIGINT                                         NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`          DATETIME                                       NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_parent_discipline_id` (`parent_discipline_id`),
    KEY `idx_level` (`level`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of disciplines.';
