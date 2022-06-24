CREATE DATABASE  IF NOT EXISTS `telecom` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `telecom`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: telecom
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `abonent`
--

DROP TABLE IF EXISTS `abonent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `abonent` (
  `idAbonent` int NOT NULL AUTO_INCREMENT,
  `idUser` int DEFAULT NULL,
  `number` varchar(25) DEFAULT NULL,
  `personalAccount` int DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `address` int DEFAULT NULL,
  `contact` int DEFAULT NULL,
  `passport` int DEFAULT NULL,
  PRIMARY KEY (`idAbonent`),
  KEY `abonent_user_idx` (`idUser`),
  KEY `address_abonent_idx` (`address`),
  KEY `abonent_contract_idx` (`contact`),
  KEY `abonent_idx` (`passport`),
  CONSTRAINT `abonent` FOREIGN KEY (`passport`) REFERENCES `datapassport` (`idDataPassport`),
  CONSTRAINT `abonent_contract` FOREIGN KEY (`contact`) REFERENCES `contract` (`idContract`),
  CONSTRAINT `abonent_user` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`),
  CONSTRAINT `address_abonent` FOREIGN KEY (`address`) REFERENCES `address` (`idAddress`),
  CONSTRAINT `FK6umlpi5cpqvwia0b43qapxfog` FOREIGN KEY (`address`) REFERENCES `address` (`idAddress`),
  CONSTRAINT `FKdfdlccqoug4pecb75pfps83b8` FOREIGN KEY (`contact`) REFERENCES `contract` (`idContract`),
  CONSTRAINT `FKktip9rcwmt9mmssf4tg64lcfr` FOREIGN KEY (`passport`) REFERENCES `datapassport` (`idDataPassport`),
  CONSTRAINT `FKp0mouwfvyvojqt1ah5crl9p7b` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abonent`
--

LOCK TABLES `abonent` WRITE;
/*!40000 ALTER TABLE `abonent` DISABLE KEYS */;
INSERT INTO `abonent` VALUES (1,1,'78А000001',110891,'janna22101981@mail.ru',1,1,1),(2,2,'78А000002',110892,'nataliya27@yandex.ru',2,2,2),(3,3,'78А000003',110893,'ignatiy1987@yandex.ru',3,3,3),(4,4,'78А000004',110894,'klara6712@mail.ru',4,4,4),(5,5,'78А000005',110895,'filipp7232@outlook.com',5,5,5),(6,6,'78А000006',110896,'olga21@yandex.ru',6,6,6),(7,7,'78А000007',110897,'nonna.osina@gmail.com',7,7,7),(8,8,'78А000008',110898,'timofey05091965@yandex.ru',8,8,8),(9,9,'78А000009',110899,'apollinariya25@yandex.ru',9,9,9),(10,10,'78А000010',110900,'vasilisa1988@yandex.ru',10,10,10);
/*!40000 ALTER TABLE `abonent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `idAddress` int NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `house` varchar(45) DEFAULT NULL,
  `entrance` int DEFAULT NULL,
  `apartment` int DEFAULT NULL,
  PRIMARY KEY (`idAddress`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Ставрополь','ЯнкиКупалы ул.','д. 16 ',1,5),(2,'Пенза','Новый пер.','д. 23',2,6),(3,'Дербент','Речной пер.','д. 13',2,8),(4,'Махачкала','Рабочая ул.','д. 5',1,9),(5,'Махачкала','ЯнкиКупалы ул.','д. 4',1,23),(6,'Каспийск','Максима Горького ул.','д. 7',1,6),(7,'Сыктывкар','Новая ул.','д. 17',3,4),(8,'Елец','Вокзальная ул.','д. 4 ',4,16),(9,'Шахты','ЯнкиКупалы ул.','д. 12',2,9),(10,'Рубцовск','Социалистическая ул.','д. 19 ',3,10);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contract`
--

DROP TABLE IF EXISTS `contract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contract` (
  `idContract` int NOT NULL AUTO_INCREMENT,
  `number` varchar(45) DEFAULT NULL,
  `typeContract` int DEFAULT NULL,
  `dateBegin` date DEFAULT NULL,
  `dateEnd` date DEFAULT NULL,
  `noteReasonEnd` varchar(255) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idContract`),
  KEY `contract_type_idx` (`typeContract`),
  CONSTRAINT `contract_type` FOREIGN KEY (`typeContract`) REFERENCES `typecontract` (`idTypeContract`),
  CONSTRAINT `FKmsrqfhbiefpkqtclk5b5twmox` FOREIGN KEY (`typeContract`) REFERENCES `typecontract` (`idTypeContract`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contract`
--

LOCK TABLES `contract` WRITE;
/*!40000 ALTER TABLE `contract` DISABLE KEYS */;
INSERT INTO `contract` VALUES (1,'78А000001-1 - 2018',2,'2018-01-01','2018-01-05',NULL,'active'),(2,'78А000002-2 - 2018',2,'2018-01-02',NULL,NULL,'inactive'),(3,'78А000003-3 - 2018',2,'2018-01-03',NULL,NULL,'active'),(4,'78А000004-4 - 2018',2,'2018-01-04',NULL,NULL,'active'),(5,'78А000005-5 - 2019',2,'2018-01-05',NULL,NULL,'active'),(6,'78А000006-6 - 2019',2,'2018-01-06',NULL,NULL,'active'),(7,'78А000007-7 - 2019',2,'2018-01-07',NULL,NULL,'active'),(8,'78А000008-8 - 2019',2,'2018-01-08',NULL,NULL,'active'),(9,'78А000009-9 - 2019',2,'2018-01-09',NULL,NULL,'active'),(10,'78А000010-10 - 2019',2,'2018-01-10',NULL,NULL,'active');
/*!40000 ALTER TABLE `contract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datapassport`
--

DROP TABLE IF EXISTS `datapassport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datapassport` (
  `idDataPassport` int NOT NULL AUTO_INCREMENT,
  `seria` varchar(4) DEFAULT NULL,
  `number` varchar(6) DEFAULT NULL,
  `dataIssue` date DEFAULT NULL,
  `issuing` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idDataPassport`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datapassport`
--

LOCK TABLES `datapassport` WRITE;
/*!40000 ALTER TABLE `datapassport` DISABLE KEYS */;
INSERT INTO `datapassport` VALUES (1,'4282','649753','2011-05-20','ОВД России по г. Артем'),(2,'4972','165137','2019-03-20','Управление внутренних дел по г. Курган'),(3,'4619','780862','2016-09-20','Отделением УФМС России в г. Тольятти'),(4,'4687','213142','2002-08-20','Отделением УФМС России по г. Пенза'),(5,'4982','163981','2003-09-20','Отделом внутренних дел России по г. Каменск - Уральский'),(6,'4038','608863','2024-11-20','Управление внутренних дел по г. Пушкино'),(7,'4413','309925','2020-01-20','Отделением УФМС России по г. Армавир'),(8,'4579','439740','2010-08-20','Отделом УФМС России по г. Брянск'),(9,'4929','194980','2026-01-20','Отделом УФМС России по г. Самара'),(10,'4675','533085','2009-08-20','Отделением УФМС России по г. Йошкар-Ола');
/*!40000 ALTER TABLE `datapassport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipment`
--

DROP TABLE IF EXISTS `equipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipment` (
  `idEquipment` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `type` int DEFAULT NULL,
  `idInformation` int DEFAULT NULL,
  PRIMARY KEY (`idEquipment`),
  KEY `eq_in_idx` (`idInformation`),
  KEY `eq_type_idx` (`type`),
  CONSTRAINT `eq_in` FOREIGN KEY (`idInformation`) REFERENCES `informationabouttheequipment` (`idInformationAboutTheEquipment`),
  CONSTRAINT `eq_type` FOREIGN KEY (`type`) REFERENCES `typesofequipment` (`idTypes`),
  CONSTRAINT `FK9oepvjlrljhydya3w82xcqk5s` FOREIGN KEY (`type`) REFERENCES `typesofequipment` (`idTypes`),
  CONSTRAINT `FKfpadmv2mi27obd23asuqx8p5y` FOREIGN KEY (`idInformation`) REFERENCES `informationabouttheequipment` (`idInformationAboutTheEquipment`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment`
--

LOCK TABLES `equipment` WRITE;
/*!40000 ALTER TABLE `equipment` DISABLE KEYS */;
INSERT INTO `equipment` VALUES (1,'D-Link-1','false',1,NULL),(2,'NEC-1','false',2,NULL),(3,'Cisco-1','true',3,NULL),(4,'NEC-2','true',2,NULL),(5,'NEC-2','false',2,NULL),(6,'NEC-3','false',2,NULL),(7,'NEC-4','true',2,NULL),(8,'D-Link-2','false',1,NULL),(9,'D-Link-3','true',1,NULL),(10,'D-Link-4','false',1,NULL),(11,'D-Link-5','false',1,NULL),(12,'Cisco-2','false',3,NULL),(13,'Cisco-3','false',3,NULL),(14,'Cisco-4','false',3,NULL),(15,'Cisco-5','false',3,NULL),(16,'D-Link-6','false',1,NULL),(17,'D-Link-7','false',1,NULL),(18,'D-Link-8','false',1,NULL),(19,'D-Link-9','false',1,NULL),(20,'D-Link-10','false',1,NULL),(21,'NEC-5','false',2,NULL),(22,'NEC-6','false',2,NULL),(23,'NEC-7','false',2,NULL),(24,'NEC-8','false',2,NULL),(25,'NEC-9','false',2,NULL),(26,'D-Link-11','false',1,NULL),(27,'D-Link-12','false',1,NULL),(28,'D-Link-13','false',1,NULL),(29,'D-Link-14','false',1,NULL),(30,'D-Link-15','false',1,NULL);
/*!40000 ALTER TABLE `equipment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipmentabonent`
--

DROP TABLE IF EXISTS `equipmentabonent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipmentabonent` (
  `idEquipmentAbonent` int NOT NULL AUTO_INCREMENT,
  `idAbonent` int DEFAULT NULL,
  `idEquipment` int DEFAULT NULL,
  `termContract` date DEFAULT NULL,
  `conditionBuying` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEquipmentAbonent`),
  KEY `equipmentAbonent_abonent_idx` (`idAbonent`),
  KEY `equipmentAbonent_equipment_idx` (`idEquipment`),
  CONSTRAINT `equipmentAbonent_abonent` FOREIGN KEY (`idAbonent`) REFERENCES `abonent` (`idAbonent`),
  CONSTRAINT `equipmentAbonent_equipment` FOREIGN KEY (`idEquipment`) REFERENCES `equipment` (`idEquipment`),
  CONSTRAINT `FK72vu8oqfug92po43cj4a4suli` FOREIGN KEY (`idEquipment`) REFERENCES `equipment` (`idEquipment`),
  CONSTRAINT `FKc1piqjn70u0q3u28336nichy5` FOREIGN KEY (`idAbonent`) REFERENCES `abonent` (`idAbonent`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipmentabonent`
--

LOCK TABLES `equipmentabonent` WRITE;
/*!40000 ALTER TABLE `equipmentabonent` DISABLE KEYS */;
INSERT INTO `equipmentabonent` VALUES (1,1,1,NULL,NULL),(2,2,2,NULL,NULL),(3,3,3,NULL,NULL),(4,4,4,NULL,NULL),(5,5,5,NULL,NULL),(6,6,6,NULL,NULL),(7,7,7,NULL,NULL),(8,8,8,NULL,NULL),(9,9,9,NULL,NULL),(10,10,10,NULL,NULL);
/*!40000 ALTER TABLE `equipmentabonent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informationabouttheequipment`
--

DROP TABLE IF EXISTS `informationabouttheequipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `informationabouttheequipment` (
  `idInformationAboutTheEquipment` int NOT NULL AUTO_INCREMENT,
  `serialNumber` int DEFAULT NULL,
  `OSInventoryNumber` int DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `noteAboutPlace` varchar(255) DEFAULT NULL,
  `noteAboutInstatlation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idInformationAboutTheEquipment`),
  UNIQUE KEY `idInformationAboutTheEquipment_UNIQUE` (`idInformationAboutTheEquipment`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informationabouttheequipment`
--

LOCK TABLES `informationabouttheequipment` WRITE;
/*!40000 ALTER TABLE `informationabouttheequipment` DISABLE KEYS */;
/*!40000 ALTER TABLE `informationabouttheequipment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messagesupport`
--

DROP TABLE IF EXISTS `messagesupport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `messagesupport` (
  `idMessageSupport` int NOT NULL AUTO_INCREMENT,
  `idAbonent` int DEFAULT NULL,
  `message` varchar(45) DEFAULT NULL,
  `dateMessage` date DEFAULT NULL,
  `typeMessage` int DEFAULT NULL,
  PRIMARY KEY (`idMessageSupport`),
  KEY `message_abonent_idx` (`idAbonent`),
  KEY `message_type_idx` (`typeMessage`),
  CONSTRAINT `FK3sicvqeoi80okhiiqbmlb19e2` FOREIGN KEY (`idAbonent`) REFERENCES `abonent` (`idAbonent`),
  CONSTRAINT `FKex5c3gkbfhsxl3twqtjppb9dc` FOREIGN KEY (`typeMessage`) REFERENCES `typemessagesupport` (`idTypeMessageSupport`),
  CONSTRAINT `message_abonent` FOREIGN KEY (`idAbonent`) REFERENCES `abonent` (`idAbonent`),
  CONSTRAINT `message_type` FOREIGN KEY (`typeMessage`) REFERENCES `typemessagesupport` (`idTypeMessageSupport`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messagesupport`
--

LOCK TABLES `messagesupport` WRITE;
/*!40000 ALTER TABLE `messagesupport` DISABLE KEYS */;
/*!40000 ALTER TABLE `messagesupport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `placement`
--

DROP TABLE IF EXISTS `placement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `placement` (
  `idPlacement` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `connectionPoint` varchar(255) DEFAULT NULL,
  `coordinates` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPlacement`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `placement`
--

LOCK TABLES `placement` WRITE;
/*!40000 ALTER TABLE `placement` DISABLE KEYS */;
/*!40000 ALTER TABLE `placement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ports`
--

DROP TABLE IF EXISTS `ports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ports` (
  `idPort` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `IPAddress` varchar(255) DEFAULT NULL,
  `MAC` varchar(45) DEFAULT NULL,
  `idEquipment` int DEFAULT NULL,
  `portsType` int DEFAULT NULL,
  `idPlacement` int DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPort`),
  KEY `id_equipment_idx` (`idEquipment`),
  KEY `id_type_idx` (`portsType`),
  KEY `id_placement_idx` (`idPlacement`),
  CONSTRAINT `FK2of433f9w45f9e3csjg6fmmvo` FOREIGN KEY (`portsType`) REFERENCES `portstype` (`idPortsType`),
  CONSTRAINT `FKkj4uwymdkicm2lprpu4f0110` FOREIGN KEY (`idPlacement`) REFERENCES `placement` (`idPlacement`),
  CONSTRAINT `FKltcw3nljp626ep0tsfdrejr50` FOREIGN KEY (`idEquipment`) REFERENCES `informationabouttheequipment` (`idInformationAboutTheEquipment`),
  CONSTRAINT `id_equipment` FOREIGN KEY (`idEquipment`) REFERENCES `informationabouttheequipment` (`idInformationAboutTheEquipment`),
  CONSTRAINT `id_placement` FOREIGN KEY (`idPlacement`) REFERENCES `placement` (`idPlacement`),
  CONSTRAINT `id_type` FOREIGN KEY (`portsType`) REFERENCES `portstype` (`idPortsType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ports`
--

LOCK TABLES `ports` WRITE;
/*!40000 ALTER TABLE `ports` DISABLE KEYS */;
/*!40000 ALTER TABLE `ports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `portstype`
--

DROP TABLE IF EXISTS `portstype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `portstype` (
  `idPortsType` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPortsType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `portstype`
--

LOCK TABLES `portstype` WRITE;
/*!40000 ALTER TABLE `portstype` DISABLE KEYS */;
/*!40000 ALTER TABLE `portstype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `idService` int NOT NULL AUTO_INCREMENT,
  `idAbonent` int DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`idService`),
  KEY `service_abonent_idx` (`idAbonent`),
  CONSTRAINT `FKg996s5v175sgjsln1nnnkbldl` FOREIGN KEY (`idAbonent`) REFERENCES `abonent` (`idAbonent`),
  CONSTRAINT `service_abonent` FOREIGN KEY (`idAbonent`) REFERENCES `abonent` (`idAbonent`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,1,'100 mb','2022-05-30'),(2,2,'100 mb','2022-05-30'),(3,3,'100 mb','2022-05-30'),(4,4,'100 mb','2022-05-30'),(5,5,'100 mb','2022-05-30'),(6,6,'100 mb','2022-05-30'),(7,7,'100 mb','2022-05-30'),(8,8,'100 mb','2022-05-30'),(9,9,'100 mb','2022-05-30'),(10,10,'100 mb','2022-05-30');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `technicalsupport`
--

DROP TABLE IF EXISTS `technicalsupport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `technicalsupport` (
  `idTechnicalSupport` int NOT NULL AUTO_INCREMENT,
  `idAbonent` int DEFAULT NULL,
  `appeal` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTechnicalSupport`),
  KEY `id_abonent_idx` (`idAbonent`),
  CONSTRAINT `FK7bts7580vpiqegum7fdljtpvs` FOREIGN KEY (`idAbonent`) REFERENCES `abonent` (`idAbonent`),
  CONSTRAINT `id_abonent` FOREIGN KEY (`idAbonent`) REFERENCES `abonent` (`idAbonent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `technicalsupport`
--

LOCK TABLES `technicalsupport` WRITE;
/*!40000 ALTER TABLE `technicalsupport` DISABLE KEYS */;
/*!40000 ALTER TABLE `technicalsupport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `typecontract`
--

DROP TABLE IF EXISTS `typecontract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `typecontract` (
  `idTypeContract` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTypeContract`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `typecontract`
--

LOCK TABLES `typecontract` WRITE;
/*!40000 ALTER TABLE `typecontract` DISABLE KEYS */;
INSERT INTO `typecontract` VALUES (1,'с пролонгацией'),(2,'без пролонгации');
/*!40000 ALTER TABLE `typecontract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `typemessagesupport`
--

DROP TABLE IF EXISTS `typemessagesupport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `typemessagesupport` (
  `idTypeMessageSupport` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idTypeMessageSupport`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `typemessagesupport`
--

LOCK TABLES `typemessagesupport` WRITE;
/*!40000 ALTER TABLE `typemessagesupport` DISABLE KEYS */;
INSERT INTO `typemessagesupport` VALUES (1,'Проблемы с интернетом'),(2,'Доступ к кинотеатру'),(3,'Не показывают TV-каналы'),(4,'Расторжение договора'),(5,'Другое');
/*!40000 ALTER TABLE `typemessagesupport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `typesofequipment`
--

DROP TABLE IF EXISTS `typesofequipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `typesofequipment` (
  `idTypes` int NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTypes`),
  UNIQUE KEY `idTypes_UNIQUE` (`idTypes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `typesofequipment`
--

LOCK TABLES `typesofequipment` WRITE;
/*!40000 ALTER TABLE `typesofequipment` DISABLE KEYS */;
INSERT INTO `typesofequipment` VALUES (1,'abonent'),(2,'magistral'),(3,'connect');
/*!40000 ALTER TABLE `typesofequipment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `idUser` int NOT NULL AUTO_INCREMENT,
  `surname` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `patronymic` varchar(255) DEFAULT NULL,
  `number` int DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `idUser_UNIQUE` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Маслака','Жанна','Петровна',100101,'100101'),(2,'Гриневеца','Наталия','Афанасьевна',100102,'100102'),(3,'Янов','Игнатий','Тимофеевич',100103,'100103'),(4,'Фастера','Клара','Герасимовна',100104,'100104'),(5,'Кирсанов','Филипп','Германович',100105,'100105'),(6,'Быкова','Ольга','Герасимовна',100106,'100106'),(7,'Осина','Нонна','Ростиславовна',100107,'100107'),(8,'Илюшин','Тимофей','Савванович',100108,'100108'),(9,'Блантер','Аполлинария','Григориевна',100109,'100109'),(10,'Левковича','Василиса','Вячеславовна',100110,'100110');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-08 11:35:37
