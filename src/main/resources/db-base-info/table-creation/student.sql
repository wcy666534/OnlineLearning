CREATE TABLE `student`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'ID of the student.',
    `student_number`     VARCHAR(100) NOT NULL COMMENT 'Student number of the student.',
    `name`               VARCHAR(200) NOT NULL COMMENT 'Name of the student',
    `class_id`           BIGINT       NOT NULL COMMENT 'ID of the class that the student belongs to.',
    `start_date`         DATE          COMMENT 'Start date of the student in the class (instead of in the school).',
    `end_date`           DATE          COMMENT 'End date of the student in the class (instead of in the school).',
    `creator_id`         BIGINT       NOT NULL COMMENT 'ID of the creator who adds this record.',
    `creation_time`      DATETIME     NOT NULL DEFAULT NOW() COMMENT 'Creation time of this record.',
    `update_operator_id` BIGINT       NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME     NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_class_id` (`class_id`),
    UNIQUE KEY `idx_unique_class_id_student_number` (`class_id`, `student_number`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of student.';