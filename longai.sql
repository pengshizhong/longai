CREATE DATABASE  IF NOT EXISTS `longai` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `longai`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: longai
-- ------------------------------------------------------
-- Server version	5.6.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `enroll`
--

DROP TABLE IF EXISTS `enroll`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `enroll` (
  `enroll_sid` int(11) NOT NULL AUTO_INCREMENT,
  `event_sid` int(11) DEFAULT NULL,
  `user_sid` int(11) DEFAULT NULL,
  `enroll_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`enroll_sid`),
  KEY `FK_Relationship_2` (`user_sid`),
  KEY `FK_Relationship_3` (`event_sid`),
  CONSTRAINT `FK_Relationship_2` FOREIGN KEY (`user_sid`) REFERENCES `user` (`user_sid`),
  CONSTRAINT `FK_Relationship_3` FOREIGN KEY (`event_sid`) REFERENCES `event` (`event_sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enroll`
--

LOCK TABLES `enroll` WRITE;
/*!40000 ALTER TABLE `enroll` DISABLE KEYS */;
/*!40000 ALTER TABLE `enroll` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `event_sid` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(10) DEFAULT NULL,
  `title` varchar(20) DEFAULT NULL,
  `sponsors` varchar(30) DEFAULT NULL,
  `starttime` datetime DEFAULT NULL,
  `endtime` datetime DEFAULT NULL,
  `status` enum('READY','START','END') DEFAULT NULL,
  `contenturl` varchar(200) DEFAULT NULL,
  `permission` varchar(10) DEFAULT NULL,
  `location` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`event_sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message` (
  `message_sid` int(11) NOT NULL AUTO_INCREMENT,
  `message_id` varchar(10) DEFAULT NULL,
  `from` varchar(30),
  `to` varchar(30),
  `status` enum('FAILED','SENDING','SUCCEED') DEFAULT NULL,
  `sendtime` datetime DEFAULT NULL,
  `receivetime` datetime DEFAULT NULL,
  PRIMARY KEY (`message_sid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` VALUES (1,NULL,'5566',NULL,NULL,NULL,NULL),(2,NULL,'5566',NULL,NULL,NULL,NULL),(3,NULL,'565656','t5',NULL,NULL,NULL);
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `moment`
--

DROP TABLE IF EXISTS `moment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `moment` (
  `moment_id` int(11) NOT NULL AUTO_INCREMENT,
  `moment_content` varchar(200) DEFAULT NULL,
  `moment_pubtime` datetime DEFAULT NULL,
  PRIMARY KEY (`moment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `moment`
--

LOCK TABLES `moment` WRITE;
/*!40000 ALTER TABLE `moment` DISABLE KEYS */;
/*!40000 ALTER TABLE `moment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `momentcomment`
--

DROP TABLE IF EXISTS `momentcomment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `momentcomment` (
  `momentcomment_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_sid` int(11) DEFAULT NULL,
  `moment_id` int(11) DEFAULT NULL,
  `momentcommentcontent` varchar(200) DEFAULT NULL,
  `momentcontentpubtime` datetime DEFAULT NULL,
  PRIMARY KEY (`momentcomment_id`),
  KEY `FK_Relationship_6` (`user_sid`),
  KEY `FK_Relationship_9` (`moment_id`),
  CONSTRAINT `FK_Relationship_6` FOREIGN KEY (`user_sid`) REFERENCES `user` (`user_sid`),
  CONSTRAINT `FK_Relationship_9` FOREIGN KEY (`moment_id`) REFERENCES `moment` (`moment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `momentcomment`
--

LOCK TABLES `momentcomment` WRITE;
/*!40000 ALTER TABLE `momentcomment` DISABLE KEYS */;
/*!40000 ALTER TABLE `momentcomment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `momentlike`
--

DROP TABLE IF EXISTS `momentlike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `momentlike` (
  `moment_id` int(11) DEFAULT NULL,
  `user_sid` int(11) DEFAULT NULL,
  `momentlike_id` int(11) NOT NULL AUTO_INCREMENT,
  `momentlikepubtime` datetime DEFAULT NULL,
  PRIMARY KEY (`momentlike_id`),
  KEY `FK_Relationship_7` (`user_sid`),
  KEY `FK_Relationship_8` (`moment_id`),
  CONSTRAINT `FK_Relationship_7` FOREIGN KEY (`user_sid`) REFERENCES `user` (`user_sid`),
  CONSTRAINT `FK_Relationship_8` FOREIGN KEY (`moment_id`) REFERENCES `moment` (`moment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `momentlike`
--

LOCK TABLES `momentlike` WRITE;
/*!40000 ALTER TABLE `momentlike` DISABLE KEYS */;
/*!40000 ALTER TABLE `momentlike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(1000) DEFAULT NULL,
  `auther` varchar(20) DEFAULT NULL,
  `title` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newscomment`
--

DROP TABLE IF EXISTS `newscomment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newscomment` (
  `newscomment_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_id` int(11) DEFAULT NULL,
  `user_sid` int(11) DEFAULT NULL,
  `comment_contet` varchar(200) DEFAULT NULL,
  `pubtime` datetime DEFAULT NULL,
  PRIMARY KEY (`newscomment_id`),
  KEY `FK_Relationship_10` (`news_id`),
  KEY `FK_Relationship_4` (`user_sid`),
  CONSTRAINT `FK_Relationship_10` FOREIGN KEY (`news_id`) REFERENCES `news` (`news_id`),
  CONSTRAINT `FK_Relationship_4` FOREIGN KEY (`user_sid`) REFERENCES `user` (`user_sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newscomment`
--

LOCK TABLES `newscomment` WRITE;
/*!40000 ALTER TABLE `newscomment` DISABLE KEYS */;
/*!40000 ALTER TABLE `newscomment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newslike`
--

DROP TABLE IF EXISTS `newslike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newslike` (
  `newslike_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_sid` int(11) DEFAULT NULL,
  `news_id` int(11) DEFAULT NULL,
  `newslike_pubtime` char(10) DEFAULT NULL,
  PRIMARY KEY (`newslike_id`),
  KEY `FK_Relationship_11` (`news_id`),
  KEY `FK_Relationship_5` (`user_sid`),
  CONSTRAINT `FK_Relationship_11` FOREIGN KEY (`news_id`) REFERENCES `news` (`news_id`),
  CONSTRAINT `FK_Relationship_5` FOREIGN KEY (`user_sid`) REFERENCES `user` (`user_sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newslike`
--

LOCK TABLES `newslike` WRITE;
/*!40000 ALTER TABLE `newslike` DISABLE KEYS */;
/*!40000 ALTER TABLE `newslike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `picture`
--

DROP TABLE IF EXISTS `picture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `picture` (
  `picture_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `picname` varchar(45) NOT NULL,
  `picture_pubtime` date NOT NULL,
  `originallurl` varchar(200) NOT NULL,
  `sid` varchar(45) NOT NULL,
  `permisson` varchar(45) NOT NULL,
  `nailurl` varchar(200) NOT NULL,
  PRIMARY KEY (`picture_id`),
  UNIQUE KEY `picture_id_UNIQUE` (`picture_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_sid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `picture`
--

LOCK TABLES `picture` WRITE;
/*!40000 ALTER TABLE `picture` DISABLE KEYS */;
/*!40000 ALTER TABLE `picture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `name` varchar(50) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `location` varchar(200) DEFAULT NULL,
  `biography` varchar(200) DEFAULT NULL,
  `profilepic` varchar(200) DEFAULT NULL,
  `gender` enum('男','女') DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `preferencegens` double DEFAULT NULL,
  `selfgens` double DEFAULT NULL,
  `user_sid` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`user_sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL);
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

-- Dump completed on 2015-08-18 10:16:23
