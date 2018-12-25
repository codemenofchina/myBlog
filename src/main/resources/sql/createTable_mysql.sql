CREATE TABLE user (
  user_id int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  user_account varchar(64) NOT NULL COMMENT '登录账号',
  password varchar(128) NOT NULL COMMENT '密码',
  user_name varchar(64) NOT NULL COMMENT '用户名',
  user_type int(2) NOT NULL DEFAULT '1' COMMENT '用户种类，默认为1',
  user_describe varchar(256) DEFAULT NULL COMMENT '秒速',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE content (
  content_id int(10) NOT NULL AUTO_INCREMENT,
  content_author int(10) NOT NULL,
  content_type int(10) NOT NULL,
  content_title varchar(256) NOT NULL,
  create_time datetime NOT NULL,
  content blob,
  PRIMARY KEY (`content_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE menu (
  menu_id int(10) NOT NULL AUTO_INCREMENT,
  menu_name varchar(64) NOT NULL,
  parent_id varchar(32) NOT NULL,
  menu_order int(2) NOT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

