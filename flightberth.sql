/*
Navicat MySQL Data Transfer

Source Server         : Test
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : flightberth

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2020-03-25 15:34:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `aircompany_info`
-- ----------------------------
DROP TABLE IF EXISTS `aircompany_info`;
CREATE TABLE `aircompany_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `air_company_code` int(11) NOT NULL,
  `air_company_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aircompany_info
-- ----------------------------

-- ----------------------------
-- Table structure for `authority_info`
-- ----------------------------
DROP TABLE IF EXISTS `authority_info`;
CREATE TABLE `authority_info` (
  `authority_code` int(11) NOT NULL AUTO_INCREMENT,
  `authority_name` varchar(255) NOT NULL,
  PRIMARY KEY (`authority_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority_info
-- ----------------------------

-- ----------------------------
-- Table structure for `berth_info`
-- ----------------------------
DROP TABLE IF EXISTS `berth_info`;
CREATE TABLE `berth_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `berth_code` int(11) NOT NULL,
  `berth_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of berth_info
-- ----------------------------

-- ----------------------------
-- Table structure for `flight_info`
-- ----------------------------
DROP TABLE IF EXISTS `flight_info`;
CREATE TABLE `flight_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `flight_code` int(11) NOT NULL,
  `air_company_code` int(255) NOT NULL,
  `flight_num` int(11) NOT NULL,
  `flight_date` date NOT NULL,
  `redundant_business_class` int(11) NOT NULL,
  `redundant_first_class` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flight_info
-- ----------------------------

-- ----------------------------
-- Table structure for `price_info`
-- ----------------------------
DROP TABLE IF EXISTS `price_info`;
CREATE TABLE `price_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `price_code` int(11) NOT NULL,
  `price` double(11,0) NOT NULL,
  `user_code` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `flight_code` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `del_flag` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of price_info
-- ----------------------------

-- ----------------------------
-- Table structure for `tic_info`
-- ----------------------------
DROP TABLE IF EXISTS `tic_info`;
CREATE TABLE `tic_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identity` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `buy_way` int(11) NOT NULL,
  `air_company_code` int(11) NOT NULL,
  `flight_num` int(11) NOT NULL,
  `start` varchar(255) NOT NULL,
  `destination` varchar(255) NOT NULL,
  `flight_date` date NOT NULL,
  `berth_code` int(11) NOT NULL,
  `gate_num` varchar(255) NOT NULL,
  `seat_num` varchar(255) NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `tic_code` int(11) NOT NULL,
  `flight_time` time NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tic_info
-- ----------------------------

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_code` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_sex` varchar(255) NOT NULL,
  `user_age` int(11) NOT NULL,
  `phone` int(11) NOT NULL,
  `identity` int(11) NOT NULL,
  `authority` int(11) NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
