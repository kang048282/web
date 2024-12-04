DROP TABLE IF EXISTS `todo`;

CREATE TABLE `todo` (
                        `id` INT AUTO_INCREMENT PRIMARY KEY,
                        `name` VARCHAR(255) NOT NULL,
                        `phone` VARCHAR(15) NOT NULL,
                        `email` VARCHAR(255),
                        `avatar` VARCHAR(255)
);


