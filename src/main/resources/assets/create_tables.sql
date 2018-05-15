CREATE DATABASE `truelogic`;

USE `truelogic`;

CREATE TABLE `bookshelf` (
  `id` int NOT NULL,
  `isbn` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `subtitle` varchar(255) DEFAULT NULL,
  `authors` varchar(255) DEFAULT NULL,
  `published` DATETIME DEFAULT NULL,
  `pages` NUMERIC   DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `instock` BIT DEFAULT NULL,
  PRIMARY KEY (`id`)
);
