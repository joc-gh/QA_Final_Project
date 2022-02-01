DROP TABLE IF EXISTS `spell`;

CREATE TABLE `spell` (
	`name` VARCHAR(255) PRIMARY KEY,
	`level` INT NOT NULL,
	`school` VARCHAR(255) NOT NULL,
    CHECK(`name` <> ''),
    CHECK(`school` <> ''),
    CHECK(`level` >= 0),
    CHECK(`level` <= 9)
);