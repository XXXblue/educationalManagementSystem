/*
Navicat MySQL Data Transfer

Source Server         : localhost_3308
Source Server Version : 50717
Source Host           : localhost:3308
Source Database       : educationalmanagementsystem

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-02-25 13:30:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for applygrade
-- ----------------------------
DROP TABLE IF EXISTS `applygrade`;
CREATE TABLE `applygrade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `coursenum` varchar(60) DEFAULT NULL,
  `ifpass` varchar(10) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  `updatetime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of applygrade
-- ----------------------------
INSERT INTO `applygrade` VALUES ('1', 'af0bde28-533b-486b-ba0b-cd3e2205a456', '2', '2017-12-25', '2017-12-25');

-- ----------------------------
-- Table structure for classinfo
-- ----------------------------
DROP TABLE IF EXISTS `classinfo`;
CREATE TABLE `classinfo` (
  `ClassNum` varchar(10) NOT NULL COMMENT '课室编号',
  `ClassMan` char(10) DEFAULT NULL COMMENT '课室负责人',
  `ClassManTel` varchar(20) DEFAULT NULL COMMENT '课室负责人联系方式',
  `LimitNum` int(11) DEFAULT NULL COMMENT '课室人数上限',
  `ClassType` varchar(10) DEFAULT NULL COMMENT '多媒体教室|实验室',
  PRIMARY KEY (`ClassNum`),
  KEY `FK_classinfo` (`ClassMan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classinfo
-- ----------------------------
INSERT INTO `classinfo` VALUES ('A201', '2', '22', '2', '2');
INSERT INTO `classinfo` VALUES ('B303', '1', '1', '1', '2');
INSERT INTO `classinfo` VALUES ('C308', '我', '123456', '100', '3');
INSERT INTO `classinfo` VALUES ('E301', '王中隆', '12345', '666', '2');
INSERT INTO `classinfo` VALUES ('E316', '2', '3', '3', '3');

-- ----------------------------
-- Table structure for courseinfo
-- ----------------------------
DROP TABLE IF EXISTS `courseinfo`;
CREATE TABLE `courseinfo` (
  `CourseNum` char(60) NOT NULL COMMENT '课程编号',
  `ClassNum` varchar(10) DEFAULT NULL COMMENT '课室编号',
  `CourseTeacherNum` char(10) DEFAULT NULL COMMENT '教师工号',
  `CourseNumLimit` varchar(11) DEFAULT NULL COMMENT '课程人数限制',
  `CourseFree` varchar(11) DEFAULT NULL COMMENT '课程人数剩余',
  `CreateTime` datetime NOT NULL COMMENT '创建时间',
  `UpdateTime` datetime NOT NULL COMMENT '更新时间',
  `TermYear` varchar(10) DEFAULT NULL COMMENT '学年',
  `CourseStartWeek` varchar(10) DEFAULT NULL COMMENT '开始周',
  `CourseEndWeek` varchar(11) DEFAULT NULL COMMENT '结束周',
  `CourseDay` varchar(11) DEFAULT NULL COMMENT '上课日期',
  `CourseDayTime` varchar(11) DEFAULT NULL COMMENT '上课所在日的课时段',
  `TermTime` char(4) DEFAULT NULL COMMENT '学期',
  `ifOpen` char(10) DEFAULT NULL COMMENT '是否公开供学生选择',
  `ifGrade` char(10) DEFAULT NULL COMMENT '成绩是否提交',
  `courseOpenNum` char(10) DEFAULT NULL COMMENT '开课最低人数',
  `courseStatus` char(10) DEFAULT NULL COMMENT '课程状态',
  `kcnum` varchar(60) DEFAULT NULL COMMENT '课程编号',
  PRIMARY KEY (`CourseNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of courseinfo
-- ----------------------------
INSERT INTO `courseinfo` VALUES ('04c9ba0b-81f5-473a-8aa7-bf19eee96733', 'B303', '05', '1', '0', '2017-12-25 13:14:54', '2017-12-25 13:14:54', '2008', '1', '16', '5', '3', '1', '1', '0', '1', '1', '2d122008-0db9-4e58-a5b8-842702207124');
INSERT INTO `courseinfo` VALUES ('4eeabc2c-77f9-4898-bd39-e783b858e63b', 'B303', '05', '1', '0', '2017-12-25 13:25:44', '2017-12-25 13:25:44', '2008', '1', '12', '1', '1', '1', '1', '0', '1', '1', '5d47b5d0-4adf-41f3-bed9-e0e81d4fb794');
INSERT INTO `courseinfo` VALUES ('af0bde28-533b-486b-ba0b-cd3e2205a456', 'B303', '05', '1', '0', '2017-12-18 10:14:02', '2017-12-18 10:14:02', '2017', '1', '11', '1', '1', '1', '1', '3', '1', '2', '2d122008-0db9-4e58-a5b8-842702207124');
INSERT INTO `courseinfo` VALUES ('caac708a-1b7b-4061-9da3-e54f59981171', 'A201', '05', '1', '2', '2017-12-17 14:24:53', '2017-12-17 14:24:53', '2008', '1', '16', '1', '1', '1', '1', '0', '22', '0', '2d122008-0db9-4e58-a5b8-842702207124');
INSERT INTO `courseinfo` VALUES ('d97debb8-46e7-43f3-ad6a-5759ad91e6b4', 'B303', '05', '1', '1', '2017-12-18 10:17:19', '2017-12-18 10:17:19', '2008', '1', '12', '1', '3', '1', '1', '0', '1', '0', '2d122008-0db9-4e58-a5b8-842702207124');
INSERT INTO `courseinfo` VALUES ('e7e4e769-82c2-47d8-bfe8-4ec1807a18f1', 'A201', '07', '1', '1', '2017-12-18 10:16:36', '2017-12-18 10:16:36', '2017', '1', '12', '1', '1', '1', '1', '0', '1', '0', '2d122008-0db9-4e58-a5b8-842702207124');
INSERT INTO `courseinfo` VALUES ('ed87d037-e9a7-4b62-9668-0c633c74986a', 'A201', '05', '1', '1', '2017-12-17 14:31:08', '2017-12-17 14:31:08', '2008', '1', '1', '1', '1', '2', '1', '0', '1', '0', '2d122008-0db9-4e58-a5b8-842702207124');

-- ----------------------------
-- Table structure for deptinfo
-- ----------------------------
DROP TABLE IF EXISTS `deptinfo`;
CREATE TABLE `deptinfo` (
  `DeptNum` char(10) NOT NULL COMMENT '学院编号',
  `DeptName` varchar(20) DEFAULT NULL COMMENT '学院名称',
  `DeptChairman` varchar(10) DEFAULT NULL COMMENT '学院负责人',
  `DeptTel` varchar(15) DEFAULT NULL COMMENT '学院电话',
  `DeptDesc` text COMMENT '学院简介',
  PRIMARY KEY (`DeptNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deptinfo
-- ----------------------------
INSERT INTO `deptinfo` VALUES ('05', '英雄联盟学院', '王忠龙', '123456', '好');
INSERT INTO `deptinfo` VALUES ('06', '守望先锋学院', '王中龙', '1234566', '号');
INSERT INTO `deptinfo` VALUES ('08', '绝地求生学院', '往往我', '123456', 'kkk56');
INSERT INTO `deptinfo` VALUES ('09', '穿越火线学院', '我', '123456', '好');
INSERT INTO `deptinfo` VALUES ('1', '1', 'ren', '123', 'xx');

-- ----------------------------
-- Table structure for kcinfo
-- ----------------------------
DROP TABLE IF EXISTS `kcinfo`;
CREATE TABLE `kcinfo` (
  `kcnum` varchar(80) NOT NULL,
  `kcxf` varchar(10) DEFAULT NULL COMMENT '学分',
  `kcjj` text COMMENT '简介',
  `kcxs` varchar(30) DEFAULT NULL COMMENT '学时',
  `deptnum` varchar(10) DEFAULT NULL COMMENT '所属学院',
  `kclx` varchar(30) DEFAULT NULL,
  `kcmc` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`kcnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kcinfo
-- ----------------------------
INSERT INTO `kcinfo` VALUES ('2d122008-0db9-4e58-a5b8-842702207124', '1', '1', '1', '06', '学院选修课', '语文');
INSERT INTO `kcinfo` VALUES ('5d47b5d0-4adf-41f3-bed9-e0e81d4fb794', '1', '无缝', '1', '08', '校级公选课', '五五开开挂');
INSERT INTO `kcinfo` VALUES ('632269e2-c690-4eb3-8fb7-a58d1e316fa2', '1', '学号语文', '1', '05', '必修课', '语文');
INSERT INTO `kcinfo` VALUES ('661e5fba-90cd-4149-995e-487d305877f2', '2', '可以', '2', '08', '必修课', '语文');
INSERT INTO `kcinfo` VALUES ('e8639c09-faa3-4173-aac7-45c8ca7f88ef', '3', '了解中国历史文化', '13', '05', '校级公选课', '中国历史文化');

-- ----------------------------
-- Table structure for kslxsjzd
-- ----------------------------
DROP TABLE IF EXISTS `kslxsjzd`;
CREATE TABLE `kslxsjzd` (
  `id` int(11) NOT NULL,
  `kslxmc` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kslxsjzd
-- ----------------------------
INSERT INTO `kslxsjzd` VALUES ('1', '多媒体课室');
INSERT INTO `kslxsjzd` VALUES ('2', '普通课室');
INSERT INTO `kslxsjzd` VALUES ('3', '实验楼');

-- ----------------------------
-- Table structure for majorinfo
-- ----------------------------
DROP TABLE IF EXISTS `majorinfo`;
CREATE TABLE `majorinfo` (
  `MajorNum` char(10) NOT NULL COMMENT '专业编号',
  `DeptNum` char(10) NOT NULL COMMENT '所属学院',
  `MajorName` varchar(20) DEFAULT NULL COMMENT '专业名称',
  `MajorAssistant` varchar(10) DEFAULT NULL COMMENT '专业负责人',
  `MajorTel` varchar(15) DEFAULT NULL COMMENT '专业电话',
  PRIMARY KEY (`MajorNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of majorinfo
-- ----------------------------
INSERT INTO `majorinfo` VALUES ('04', '06', '守望压枪专业', '王中龙', '123456');
INSERT INTO `majorinfo` VALUES ('05', '05', '中单卡牌专业', '王中龙', '123456');
INSERT INTO `majorinfo` VALUES ('08', '05', '下路寒冰专业', '王中龙', '123456');
INSERT INTO `majorinfo` VALUES ('11', '05', '上单剑姬专业', '王中龙', '123456');
INSERT INTO `majorinfo` VALUES ('13', '09', '压枪专业', '王中龙', '123456');

-- ----------------------------
-- Table structure for managerinfo
-- ----------------------------
DROP TABLE IF EXISTS `managerinfo`;
CREATE TABLE `managerinfo` (
  `ManagerNum` char(10) NOT NULL COMMENT '管理员账号',
  `ManagerName` varchar(10) DEFAULT NULL COMMENT '管理员姓名',
  `ManagerSex` char(2) DEFAULT NULL COMMENT '管理员性别',
  `ManagerBirthday` date DEFAULT NULL COMMENT '管理员生日',
  `ManagerPassword` varchar(20) DEFAULT NULL COMMENT '管理员密码',
  `ManagerRole` varchar(30) DEFAULT NULL COMMENT '用于角色授权',
  PRIMARY KEY (`ManagerNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of managerinfo
-- ----------------------------
INSERT INTO `managerinfo` VALUES ('admin', 'admin', null, null, '123456', 'admin');

-- ----------------------------
-- Table structure for rolepermission
-- ----------------------------
DROP TABLE IF EXISTS `rolepermission`;
CREATE TABLE `rolepermission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `role` varchar(30) DEFAULT NULL COMMENT '角色',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `url` varchar(128) DEFAULT NULL COMMENT '授权路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolepermission
-- ----------------------------
INSERT INTO `rolepermission` VALUES ('1', 'admin', 'permission', '/index');
INSERT INTO `rolepermission` VALUES ('2', 'admin', 'permission', '/main');
INSERT INTO `rolepermission` VALUES ('83', 'admin', 'permission', '/classManagement');
INSERT INTO `rolepermission` VALUES ('84', 'admin', 'permission', '/deptManagement');
INSERT INTO `rolepermission` VALUES ('85', 'admin', 'permission', '/addClassInfo');
INSERT INTO `rolepermission` VALUES ('86', 'admin', 'permission', '/classInfoTable');
INSERT INTO `rolepermission` VALUES ('87', 'admin', 'permission', '/editClassInfo');
INSERT INTO `rolepermission` VALUES ('88', 'admin', 'permission', '/delClassInfo');
INSERT INTO `rolepermission` VALUES ('89', 'admin', 'perission', '/addDeptInfo');
INSERT INTO `rolepermission` VALUES ('90', 'admin', 'permission', '/deptInfoListAll');
INSERT INTO `rolepermission` VALUES ('91', 'admin', 'permission', '/editDeptInfo');
INSERT INTO `rolepermission` VALUES ('92', 'admin', 'permission', '/editDeptInfo/');
INSERT INTO `rolepermission` VALUES ('93', 'admin', 'permission', '/delDeptInfo');
INSERT INTO `rolepermission` VALUES ('94', 'admin', 'permission', '/instituteManagement');
INSERT INTO `rolepermission` VALUES ('95', 'admin', 'permission', '/listDeptinfoselect');
INSERT INTO `rolepermission` VALUES ('96', 'admin', 'permission', '/majorInfoListAll');
INSERT INTO `rolepermission` VALUES ('97', 'admin', 'permission', '/addMajorInfo');
INSERT INTO `rolepermission` VALUES ('98', 'admin', 'permission', '/editMajorInfo');
INSERT INTO `rolepermission` VALUES ('99', 'admin', 'permission', '/delMajorInfo');
INSERT INTO `rolepermission` VALUES ('100', 'admin', 'permission', '/teacherManagement');
INSERT INTO `rolepermission` VALUES ('101', 'admin', 'permission', '/teacherInfoTable');
INSERT INTO `rolepermission` VALUES ('102', 'admin', 'permission', '/addteacherinfo');
INSERT INTO `rolepermission` VALUES ('103', 'admin', 'permission', '/delTeacherInfo');
INSERT INTO `rolepermission` VALUES ('104', 'admin', 'permission', '/editTeacherInfo');
INSERT INTO `rolepermission` VALUES ('105', 'admin', 'permission', '/studentManagement');
INSERT INTO `rolepermission` VALUES ('106', 'admin', 'permission', '/listmajorinfoselect');
INSERT INTO `rolepermission` VALUES ('107', 'admin', 'permission', '/addstudentinfo');
INSERT INTO `rolepermission` VALUES ('108', 'admin', 'permission', '/editstudentinfo');
INSERT INTO `rolepermission` VALUES ('109', 'admin', 'permission', '/delStudentInfo');
INSERT INTO `rolepermission` VALUES ('110', 'admin', 'permission', '/searchStudentInfoByCondition');
INSERT INTO `rolepermission` VALUES ('111', 'admin', 'permission', '/studentInfoListAll');
INSERT INTO `rolepermission` VALUES ('112', 'admin', 'permission', '/manageAllCourse');
INSERT INTO `rolepermission` VALUES ('113', 'admin', 'permission', '/listmajorinfoselect');
INSERT INTO `rolepermission` VALUES ('114', 'admin', 'permission', '/courseInfoTable');
INSERT INTO `rolepermission` VALUES ('115', 'admin', 'permission', '/addCourseInfo');
INSERT INTO `rolepermission` VALUES ('116', 'admin', 'permission', '/editCourseInfo');
INSERT INTO `rolepermission` VALUES ('117', 'admin', 'permission', '/delCourseInfo');
INSERT INTO `rolepermission` VALUES ('118', 'admin', 'permission', '/searchCourseByCondition');
INSERT INTO `rolepermission` VALUES ('119', 'teacher', 'permission', '/teacher/index2');
INSERT INTO `rolepermission` VALUES ('120', 'teacher', 'permission', '/teacher/schooltimetable');
INSERT INTO `rolepermission` VALUES ('121', 'teacher', 'permission', '/teacher/studentselcourseshow');
INSERT INTO `rolepermission` VALUES ('122', 'teacher', 'permission', '/teacher/teacherinfoshow');
INSERT INTO `rolepermission` VALUES ('123', 'teacher', 'permission', '/uploadTeacherPic');
INSERT INTO `rolepermission` VALUES ('124', 'teacher', 'permission', '/editTeacherInfoForSelf');
INSERT INTO `rolepermission` VALUES ('125', 'teacher', 'permission', '/teacherCourseInfoTable');
INSERT INTO `rolepermission` VALUES ('126', 'teacher', 'permission', '/searchteachercourseinfo');
INSERT INTO `rolepermission` VALUES ('127', 'teacher', 'permission', '/detail/');
INSERT INTO `rolepermission` VALUES ('128', 'teacher', 'permission', '/teacher/main');
INSERT INTO `rolepermission` VALUES ('129', 'teacher', 'permission', '/teacher/teacherinfoshow');
INSERT INTO `rolepermission` VALUES ('130', 'student', 'permission', '/student/index3');
INSERT INTO `rolepermission` VALUES ('131', 'student', 'permission', '/student/studentschooltimetable');
INSERT INTO `rolepermission` VALUES ('132', 'student', 'permission', '/studentSelCourse');
INSERT INTO `rolepermission` VALUES ('133', 'student', 'permission', '/student/studentSelfInfo');
INSERT INTO `rolepermission` VALUES ('134', 'student', 'permission', '/student/main');
INSERT INTO `rolepermission` VALUES ('135', 'student', 'permission', '/searchstudentcourseinfo');
INSERT INTO `rolepermission` VALUES ('136', 'student', 'permission', '/stuselcourseInfoTable');
INSERT INTO `rolepermission` VALUES ('137', 'student', 'permission', '/stuselcourse/');
INSERT INTO `rolepermission` VALUES ('138', 'student', 'permission', '/sturemovecourse/');
INSERT INTO `rolepermission` VALUES ('139', 'student', 'permission', '/searchstudentcourseinfo');
INSERT INTO `rolepermission` VALUES ('140', 'student', 'permission', '/uploadStudentPic');
INSERT INTO `rolepermission` VALUES ('141', 'student', 'permission', '/editStudentInfoForSelf');
INSERT INTO `rolepermission` VALUES ('142', 'teacher', 'permission', '/courseStudentInfoTable');
INSERT INTO `rolepermission` VALUES ('143', 'teacher', 'permission', '/submitGrade');
INSERT INTO `rolepermission` VALUES ('144', 'admin', 'permission', '/applyGrade');
INSERT INTO `rolepermission` VALUES ('145', 'admin', 'permission', '/applygradeTable');
INSERT INTO `rolepermission` VALUES ('146', 'admin', 'permission', '/ifAgreeSubmitGrade');
INSERT INTO `rolepermission` VALUES ('147', 'admin', 'permission', '/voteManagement');
INSERT INTO `rolepermission` VALUES ('148', 'admin', 'permission', '/changeCourseStatus');
INSERT INTO `rolepermission` VALUES ('149', 'teacher', 'permission', '/changeCourseStatus');
INSERT INTO `rolepermission` VALUES ('150', 'admin', 'permission', '/kcManagement');
INSERT INTO `rolepermission` VALUES ('151', 'admin', 'permission', '/querykslxsjzd');
INSERT INTO `rolepermission` VALUES ('152', 'admin', 'permission', '/kcManagement');
INSERT INTO `rolepermission` VALUES ('153', 'admin', 'permission', '/addNewKc');
INSERT INTO `rolepermission` VALUES ('154', 'admin', 'permission', '/kcTable');
INSERT INTO `rolepermission` VALUES ('155', 'admin', 'permission', '/editKcInfo');
INSERT INTO `rolepermission` VALUES ('156', 'admin', 'permission', '/delKcInfo');
INSERT INTO `rolepermission` VALUES ('157', 'admin', 'permission', '/listSelKc');
INSERT INTO `rolepermission` VALUES ('158', 'admin', 'permission', '/searchFreeClass');
INSERT INTO `rolepermission` VALUES ('159', 'admin', 'permission', '/queryteachernum');

-- ----------------------------
-- Table structure for studentcourseinfo
-- ----------------------------
DROP TABLE IF EXISTS `studentcourseinfo`;
CREATE TABLE `studentcourseinfo` (
  `StuCourseID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `StudentNum` char(10) DEFAULT NULL COMMENT '学生编号',
  `CourseNum` char(60) DEFAULT NULL COMMENT '课室编号',
  `Grade` int(11) DEFAULT NULL COMMENT '成绩',
  `CreateTime` datetime NOT NULL COMMENT '创建时间',
  `UpdateTime` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`StuCourseID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentcourseinfo
-- ----------------------------
INSERT INTO `studentcourseinfo` VALUES ('39', '04150808', '04c9ba0b-81f5-473a-8aa7-bf19eee96733', null, '2017-12-25 14:39:33', '2017-12-25 14:39:33');
INSERT INTO `studentcourseinfo` VALUES ('40', '04150822', 'af0bde28-533b-486b-ba0b-cd3e2205a456', null, '2018-01-21 19:45:13', '2018-01-21 19:45:13');
INSERT INTO `studentcourseinfo` VALUES ('41', '04150822', '4eeabc2c-77f9-4898-bd39-e783b858e63b', null, '2018-02-25 13:27:36', '2018-02-25 13:27:36');

-- ----------------------------
-- Table structure for studentinfo
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `StudentNum` char(10) NOT NULL COMMENT '学生编号',
  `MajorNum` char(10) NOT NULL COMMENT '主修专业',
  `StudentName` varchar(10) DEFAULT NULL COMMENT '学生姓名',
  `StudentSex` char(2) DEFAULT NULL COMMENT '学生性别',
  `StudentBirthday` date DEFAULT NULL COMMENT '学生生日',
  `StudentPassword` varchar(60) DEFAULT NULL COMMENT '学生密码',
  `StudentPhoneNum` varchar(20) DEFAULT NULL COMMENT '学生电话',
  `StudentPic` varchar(128) DEFAULT NULL COMMENT '学生图片',
  `StudentRole` char(20) DEFAULT NULL COMMENT '权限',
  `StudentOrganization` char(10) DEFAULT NULL COMMENT '班级',
  `StudentComeYear` char(10) DEFAULT NULL COMMENT '学生入学年份',
  `StudentIDCard` varchar(128) DEFAULT NULL COMMENT '学生身份证',
  PRIMARY KEY (`StudentNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentinfo
-- ----------------------------
INSERT INTO `studentinfo` VALUES ('04150808', '04', 'ddd', '男', '2017-12-08', '3eea0f7b19955d3d86ec42b6ada6020c', '123456', 'http://xiaojianyu-file-server.oss-cn-shenzhen.aliyuncs.com/student/a6f7c0ea-3fba-483c-9198-444709987a2e.gif', 'student', '6', '2015', null);
INSERT INTO `studentinfo` VALUES ('04150811', '05', '王中龙', '女', '2017-12-07', '3eea0f7b19955d3d86ec42b6ada6020c', '132456', null, 'student', '6', '2015', null);
INSERT INTO `studentinfo` VALUES ('04150822', '04', '王kkk222', '男', '2017-11-22', '3eea0f7b19955d3d86ec42b6ada6020c', '12345622', 'http://xiaojianyu-file-server.oss-cn-shenzhen.aliyuncs.com/student/cc1871d2-8376-4bb9-8948-08d1d587ed6b.jpg', 'student', '8', '2015', null);
INSERT INTO `studentinfo` VALUES ('04150823', '04', '王中龙', '男', '2017-11-06', '3eea0f7b19955d3d86ec42b6ada6020c', '123456', 'http://xiaojianyu-file-server.oss-cn-shenzhen.aliyuncs.com/student/41d02f60-d6be-43de-8b03-84867b194ca3.jpg', 'student', '6', '2015', null);
INSERT INTO `studentinfo` VALUES ('04150988', '04', '王中龙', '男', '2017-12-04', '3eea0f7b19955d3d86ec42b6ada6020c', '123456', null, 'student', '10', '2015', null);

-- ----------------------------
-- Table structure for teacherinfo
-- ----------------------------
DROP TABLE IF EXISTS `teacherinfo`;
CREATE TABLE `teacherinfo` (
  `TeacherNum` char(10) NOT NULL COMMENT '教师编号',
  `DeptNum` char(10) NOT NULL COMMENT '所属学院',
  `TeacherName` varchar(10) DEFAULT NULL COMMENT '教师姓名',
  `TeacherSex` char(2) DEFAULT NULL COMMENT '教师性别',
  `TeacherBirthday` date DEFAULT NULL COMMENT '教师生日',
  `TeacherTitle` varchar(20) DEFAULT NULL COMMENT '教师专长',
  `TeacherPassword` varchar(60) DEFAULT NULL COMMENT '教师密码',
  `TeacherPhone` varchar(128) DEFAULT NULL COMMENT '教师电话',
  `TeacherRole` varchar(20) DEFAULT NULL COMMENT '角色',
  `TeacherPic` varchar(128) DEFAULT NULL COMMENT '图片',
  `TeacherIdCardNum` varchar(128) DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`TeacherNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacherinfo
-- ----------------------------
INSERT INTO `teacherinfo` VALUES ('05', '05', '王中龙', '男', '2017-11-24', '毛妹', '3eea0f7b19955d3d86ec42b6ada6020c', '123456', 'teacher', 'http://xiaojianyu-file-server.oss-cn-shenzhen.aliyuncs.com/test/a27a1b08-22ee-466a-aa81-a88d54095cec.gif', null);
INSERT INTO `teacherinfo` VALUES ('07', '06', '王中龙', '男', '2017-10-11', '毛妹', '3eea0f7b19955d3d86ec42b6ada6020c', '13202126900', 'teacher', 'http://xiaojianyu-file-server.oss-cn-shenzhen.aliyuncs.com/test/32d34384-b205-4515-9217-e74effdb7124.jpg', null);
INSERT INTO `teacherinfo` VALUES ('08', '09', '很稳', '女', '2017-12-11', '大炮瞬狙', 'efa2c11021f1a9438be4d2f42db67922', '1234566', null, null, null);
