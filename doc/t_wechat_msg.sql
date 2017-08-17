CREATE TABLE `t_wechat_msg` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `to_user_name` varchar(100) DEFAULT NULL,
  `from_user_name` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `msg_type` varchar(10) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `msg_id` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;