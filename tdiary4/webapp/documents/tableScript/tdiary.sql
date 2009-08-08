-- MySQL dump 10.13  Distrib 5.1.36, for Win32 (ia32)
--
-- Host: localhost    Database: tdiary
-- ------------------------------------------------------
-- Server version	5.1.36-community

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
-- Table structure for table `code`
--

DROP TABLE IF EXISTS `code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `code` (
  `category` varchar(30) NOT NULL,
  `code` varchar(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` tinytext,
  `delete_flag` char(1) NOT NULL,
  `create_user` varchar(50) NOT NULL,
  `create_date` date NOT NULL,
  `update_user` varchar(50) NOT NULL,
  `update_date` date NOT NULL,
  `code_seq` int(11) NOT NULL,
  PRIMARY KEY (`category`,`code`,`code_seq`)
) ENGINE=MyISAM DEFAULT CHARSET=euckr COMMENT='코드';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `code`
--

LOCK TABLES `code` WRITE;
/*!40000 ALTER TABLE `code` DISABLE KEYS */;
INSERT INTO `code` VALUES ('NATION','KR','KOREA','대한민국','N','admin','2009-07-05','admin','2009-07-05',8),('NATION','EN','USA','??','N','admin','2009-07-05','admin','2009-07-05',9),('YESNO','Y','예','예/아니오 코드의 예 코드','N','admin','2009-07-01','amdin','2009-07-05',6),('YESNO','N','아니오','예/아니오 코드의 아니오 코드','N','admin','2009-07-01','amdin','2009-07-05',7),('KR','SEOUL','서울','서울','N','admin','2009-07-05','amdin','2009-07-05',10),('KR','PUSAN','부산','부산','N','admin','2009-07-05','amdin','2009-07-05',11),('EN','NEWWYORK','뉴욕','뉴욕','N','admin','2009-07-05','amdin','2009-07-05',12),('EN','WASHINGTON','워싱톤','워싱톤','N','admin','2009-07-05','amdin','2009-07-05',13),('ROLE','ROLE_ADMIN','관리자','시스템 관리자','N','admin','2009-07-05','amdin','2009-07-05',14),('ROLE','ROLE_GENERIC','일반회원','일반회원','N','admin','2009-07-05','admin','2009-07-05',15),('ROLE','ROLE_SPECIAL','특별회원','특별회원','N','admin','2009-07-05','admin','2009-07-05',16),('JOB','BASIC','농업/임업/어업','','N','admin','2009-07-05','admin','2009-07-05',17),('JOB','MINING','광업','','N','admin','2009-07-05','admin','2009-07-05',18),('JOB','BUILLDING','건축업','','N','admin','2009-07-05','admin','2009-07-05',19),('JOB','MANUFACTURING','제조업','','N','admin','2009-07-05','admin','2009-07-05',20),('JOB','TRANSPORT','교통업','','N','admin','2009-07-05','admin','2009-07-05',21),('JOB','TRACDE','도매 및 소매업','','N','admin','2009-07-05','admin','2009-07-05',22),('JOB','FINANCE','재정, 보험, 부동산업','','N','admin','2009-07-05','admin','2009-07-05',23),('JOB','BUSINESS','사업 및 수리 서비스업','','N','admin','2009-07-05','admin','2009-07-05',24),('JOB','PERSONAL_SERVICE','개인 서비스업','','N','admin','2009-07-05','admin','2009-07-05',25),('JOB','RECREATION','오락 및 레크레이션 관계 서비스업','','N','admin','2009-07-05','admin','2009-07-05',26),('JOB','SPECIALIST','전문직 및 관계 서비스업','','N','admin','2009-07-05','admin','2009-07-05',27),('JOB','PUBLIC','공공 행정업','','N','admin','2009-07-05','admin','2009-07-05',28);
/*!40000 ALTER TABLE `code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notice` (
  `notice_seq` int(11) NOT NULL,
  `notice_title` varchar(100) NOT NULL,
  `notice_content` text NOT NULL,
  `attachment` varchar(255) DEFAULT NULL,
  `attachment_server` varchar(255) DEFAULT NULL,
  `create_user` int(11) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_user` int(11) NOT NULL,
  `update_date` datetime NOT NULL,
  `delete_flag` varchar(2) NOT NULL DEFAULT 'N',
  PRIMARY KEY (`notice_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='공지글';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES (0,'테스트 글 제목','테스트\r\n글 내용','키스킨 주문.txt','c:\\FileUpload_Notice\\키스킨 주문.txt',0,'2009-07-22 00:00:00',0,'2009-07-22 00:00:00','N'),(1,'Notice Title','Notice Contents','Attachment','AttachmentServer',1,'2009-07-07 00:00:00',1,'2009-07-09 00:00:00','N');
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sequence`
--

DROP TABLE IF EXISTS `sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sequence` (
  `sequence_table_name` varchar(100) NOT NULL,
  `next_sequence_no` int(11) NOT NULL,
  PRIMARY KEY (`sequence_table_name`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='일련번호 관리';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequence`
--

LOCK TABLES `sequence` WRITE;
/*!40000 ALTER TABLE `sequence` DISABLE KEYS */;
INSERT INTO `sequence` VALUES ('code',28),('tdiary',1),('user_info',3);
/*!40000 ALTER TABLE `sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdairy_article`
--

DROP TABLE IF EXISTS `tdairy_article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdairy_article` (
  `tdiary_article_seq` int(11) NOT NULL,
  `tdiary_seq` int(11) DEFAULT NULL,
  `parent_tdiary_article_seq` int(11) DEFAULT NULL,
  `tdiary_article_title` varchar(200) NOT NULL,
  `tdiary_article_content` text NOT NULL,
  `hit_count` int(11) NOT NULL,
  `reply_count` int(11) NOT NULL,
  `attachment` varchar(255) DEFAULT NULL,
  `attachment_server` varchar(255) DEFAULT NULL,
  `scrap_code` varchar(30) NOT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `create_user` int(11) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_user` int(11) NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`tdiary_article_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='여행 글';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdairy_article`
--

LOCK TABLES `tdairy_article` WRITE;
/*!40000 ALTER TABLE `tdairy_article` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdairy_article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdiary`
--

DROP TABLE IF EXISTS `tdiary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdiary` (
  `tdiary_seq` int(11) NOT NULL,
  `tdiary_title` varchar(100) NOT NULL,
  `tdiary_introduction` text,
  `subscribe_code` varchar(30) NOT NULL,
  `publish_code` varchar(30) NOT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `create_user` int(11) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_user` int(11) NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`tdiary_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='여행일지';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdiary`
--

LOCK TABLES `tdiary` WRITE;
/*!40000 ALTER TABLE `tdiary` DISABLE KEYS */;
INSERT INTO `tdiary` VALUES (1,'fysfu','&nbsp;3e','Y','N',NULL,1,'2009-07-03 02:33:41',1,'2009-07-03 02:33:41');
/*!40000 ALTER TABLE `tdiary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdiary_article_scrap`
--

DROP TABLE IF EXISTS `tdiary_article_scrap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdiary_article_scrap` (
  `tdiary_article_scrap_seq` int(11) NOT NULL,
  `tdiary_article_seq` int(11) DEFAULT NULL,
  `tdiary_article_scrap_user` int(11) NOT NULL,
  `tdiary_article_scrap_date` datetime NOT NULL,
  PRIMARY KEY (`tdiary_article_scrap_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='여행 글 스크랩';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdiary_article_scrap`
--

LOCK TABLES `tdiary_article_scrap` WRITE;
/*!40000 ALTER TABLE `tdiary_article_scrap` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdiary_article_scrap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdiary_article_tag`
--

DROP TABLE IF EXISTS `tdiary_article_tag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdiary_article_tag` (
  `tdiary_article_tag_seq` int(11) NOT NULL,
  `tdiary_article_seq` int(11) DEFAULT NULL,
  `tdiary_article_tag_name` varchar(100) NOT NULL,
  PRIMARY KEY (`tdiary_article_tag_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='여행 글 태그';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdiary_article_tag`
--

LOCK TABLES `tdiary_article_tag` WRITE;
/*!40000 ALTER TABLE `tdiary_article_tag` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdiary_article_tag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdiary_article_tag_cloud`
--

DROP TABLE IF EXISTS `tdiary_article_tag_cloud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdiary_article_tag_cloud` (
  `tdairy_article_tag_name` varchar(100) NOT NULL,
  `tdiary_article_tag_count` int(11) NOT NULL,
  PRIMARY KEY (`tdairy_article_tag_name`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='여행 글 태그 클라우드';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdiary_article_tag_cloud`
--

LOCK TABLES `tdiary_article_tag_cloud` WRITE;
/*!40000 ALTER TABLE `tdiary_article_tag_cloud` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdiary_article_tag_cloud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdiary_photo`
--

DROP TABLE IF EXISTS `tdiary_photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdiary_photo` (
  `tdiary_photo_seq` int(11) NOT NULL,
  `tdiary_article_seq` int(11) DEFAULT NULL,
  `tdiary_photo_place_name` varchar(100) DEFAULT NULL,
  `tdairy_photo_longitude` decimal(10,0) DEFAULT NULL,
  `tdairy_photo_latitude` decimal(10,0) DEFAULT NULL,
  `tdiary_photo_introduction` text,
  `create_user` int(11) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_user` int(11) NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`tdiary_photo_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='여행사진';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdiary_photo`
--

LOCK TABLES `tdiary_photo` WRITE;
/*!40000 ALTER TABLE `tdiary_photo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdiary_photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdiary_subscribe`
--

DROP TABLE IF EXISTS `tdiary_subscribe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdiary_subscribe` (
  `tdiary_seq` int(11) DEFAULT NULL,
  `tdiary_subscribe_seq` char(10) DEFAULT NULL,
  `publish_user` char(10) DEFAULT NULL,
  `subscribe_user` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='여행일지 구독';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdiary_subscribe`
--

LOCK TABLES `tdiary_subscribe` WRITE;
/*!40000 ALTER TABLE `tdiary_subscribe` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdiary_subscribe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_info` (
  `user_seq` int(11) NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone_no` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `emailAddress` varchar(50) NOT NULL,
  `job_code` varchar(30) DEFAULT NULL,
  `system_use_code` varchar(30) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  `delete_flag` varchar(2) NOT NULL DEFAULT 'N',
  PRIMARY KEY (`user_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='사용자 정보';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
INSERT INTO `user_info` VALUES (1,'admin','admin','admin','010-8978-0407','경기도 안양시 만안구 석수3동 758-1 유일 5차 201호','youngmin.jun@gmail.com','SPECIALIST','ROLE_ADMIN','2009-07-01 00:00:00','2009-07-06 00:00:00','N'),(3,'youngminjun','network','전영민','010-8918-6613','경기도 안양시 만안구','youngmin.jun@gmail.com','PERSONAL_SERVICE','ROLE_ADMIN','2009-07-06 00:00:00','2009-07-08 00:00:00','N');
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `user_role_seq` int(11) NOT NULL,
  `user_seq` int(11) DEFAULT NULL,
  `role_code` varchar(30) NOT NULL,
  PRIMARY KEY (`user_role_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=euckr COMMENT='사용자 권한 정보';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2009-08-08 17:27:22
