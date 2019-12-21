-- MySQL Workbench Forward Engineering
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
-- -----------------------------------------------------
-- Schema vehicle_insurance_schema
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema vehicle_insurance_schema
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vehicle_insurance_schema` DEFAULT CHARACTER SET latin1 ;
USE `vehicle_insurance_schema` ;
-- -----------------------------------------------------
-- Table `vehicle_insurance_schema`.`INSURANCE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_insurance_schema`.`INSURANCE` (
  `INSURANCE_ID` INT(11) NOT NULL,
  `TYPE` VARCHAR(45) NULL DEFAULT NULL,
  `EXPIRY_DATE` VARCHAR(10) NULL DEFAULT NULL,
  PRIMARY KEY (`INSURANCE_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;
-- -----------------------------------------------------
-- Table `vehicle_insurance_schema`.`OWNER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_insurance_schema`.`OWNER` (
  `OWNER_ID` INT(11) NOT NULL,
  `NAME` VARCHAR(45) NULL DEFAULT NULL,
  `SURNAME` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`OWNER_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;
-- -----------------------------------------------------
-- Table `vehicle_insurance_schema`.`VEHICLE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_insurance_schema`.`VEHICLE` (
  `PLATE_NUMBER` VARCHAR(10) NOT NULL,
  `BRAND` VARCHAR(45) NULL DEFAULT NULL,
  `TYPE` VARCHAR(45) NULL DEFAULT NULL,
  `CC` INT(5) NULL DEFAULT NULL,
  `INSURANCE_ID` INT(11) NOT NULL,
  `OWNER_ID` INT(11) NOT NULL,
  PRIMARY KEY (`PLATE_NUMBER`),
  INDEX `fk_VEHICLE_INSURANCE_idx` (`INSURANCE_ID` ASC),
  INDEX `fk_VEHICLE_OWNER1_idx` (`OWNER_ID` ASC),
  CONSTRAINT `fk_VEHICLE_INSURANCE`
    FOREIGN KEY (`INSURANCE_ID`)
    REFERENCES `vehicle_insurance_schema`.`INSURANCE` (`INSURANCE_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_VEHICLE_OWNER1`
    FOREIGN KEY (`OWNER_ID`)
    REFERENCES `vehicle_insurance_schema`.`OWNER` (`OWNER_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;