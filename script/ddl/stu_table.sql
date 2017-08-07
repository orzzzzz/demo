/*
Navicat MySQL Data Transfer

Source Server         : first_test
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : first_test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-08-07 17:16:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for stu_table
-- ----------------------------
DROP TABLE IF EXISTS `stu_table`;
CREATE TABLE `stu_table` (
  `stu_id` char(10) NOT NULL,
  `name` char(20) NOT NULL,
  `sex` char(5) DEFAULT NULL,
  `address` varchar(100) DEFAULT '杭州',
  `phone` char(20) DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_table
-- ----------------------------
INSERT INTO `stu_table` VALUES ('31202210', '赵大', '男', '杭州', '13822345567');
INSERT INTO `stu_table` VALUES ('31202211', '钱二', '女', '莆田', null);
INSERT INTO `stu_table` VALUES ('31202212', '孙三', '男', '杭州', '0571-88288828');
INSERT INTO `stu_table` VALUES ('31202213', '李四', '未知', '', null);
INSERT INTO `stu_table` VALUES ('31202214', '周五', '女', '杭州市拱墅区', '13888888888');
INSERT INTO `stu_table` VALUES ('31202215', '吴六', '男', '杭州', '3801959');
INSERT INTO `stu_table` VALUES ('31202216', '郑七', '男', '杭州', '3711548');
INSERT INTO `stu_table` VALUES ('31202218', '王八', '女', '杭州', '3876671');
