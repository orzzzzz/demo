/*
Navicat MySQL Data Transfer

Source Server         : first_test
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : first_test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-08-07 17:15:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for stu_scope
-- ----------------------------
DROP TABLE IF EXISTS `stu_scope`;
CREATE TABLE `stu_scope` (
  `stu_id` int(11) NOT NULL,
  `Chinese` varchar(5) DEFAULT NULL,
  `Math` varchar(5) DEFAULT NULL,
  `English` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_scope
-- ----------------------------
INSERT INTO `stu_scope` VALUES ('31202210', '98', '99', '96');
INSERT INTO `stu_scope` VALUES ('31202211', '90', '100', '95');
INSERT INTO `stu_scope` VALUES ('31202212', '86', '78', '74');
INSERT INTO `stu_scope` VALUES ('31202213', '98', '100', '100');
INSERT INTO `stu_scope` VALUES ('31202214', '100', '100', '100');
INSERT INTO `stu_scope` VALUES ('31202215', '59', '65', '41');
INSERT INTO `stu_scope` VALUES ('31202216', '39', '100', '80');
INSERT INTO `stu_scope` VALUES ('31202217', '100', '100', '100');
INSERT INTO `stu_scope` VALUES ('31202218', '0', '0', '0');
