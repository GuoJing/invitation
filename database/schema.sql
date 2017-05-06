DROP TABLE IF EXISTS `invitation`;
CREATE TABLE `invitation` (
  `id` int(12) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL DEFAULT '' COMMENT '姓名',
  `phone` varchar(11) NOT NULL DEFAULT '' COMMENT '电话',
  `number` int(11) unsigned NOT NULL DEFAULT 0 COMMENT '人数',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='邀请表';