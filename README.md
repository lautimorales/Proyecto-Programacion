# Proyecto-Programacion
Proyecto 1 de Programación 2.

Base de datos y tabla del proyecto:

CREATE DATABASE `ejemplo`;
USE DATABASE `ejemplo`;

CREATE TABLE `ejemplo`.`jugador` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NULL DEFAULT NULL,
  `apellido` varchar(50) NULL DEFAULT NULL,
  `email` varchar(255) NULL DEFAULT NULL,
  `telefono` varchar(50) NULL DEFAULT NULL,
  `password` varchar(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;
