SHOW DATABASES;

CREATE DATABASE IF NOT EXISTS db_springouting;

CREATE TABLE db_springouting.user (
  id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name     VARCHAR(100),
  password VARCHAR(50)
);

CREATE TABLE db_springouting.activity (
  id          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title       VARCHAR(100),
  description VARCHAR(255)
);

DROP TABLE IF EXISTS db_springouting.student;
CREATE TABLE db_springouting.student (
  sid   INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50),
  email VARCHAR(100)
);

CREATE TABLE db_springouting.apply (
  id         INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  activityID INT UNSIGNED,
  sid        INT UNSIGNED,
  result     BOOLEAN
);

USE db_springouting;

ALTER TABLE db_springouting.apply
ADD CONSTRAINT fk_apply_activityID
FOREIGN KEY (activityID)
REFERENCES activity (id);
ALTER TABLE db_springouting.apply
ADD CONSTRAINT fk_apply_sid
FOREIGN KEY (sid)
REFERENCES student (sid);

INSERT INTO db_springouting.user(name, password) VALUES ("joe","1234ottf");
INSERT INTO db_springouting.user(name, password) VALUES ("jim","1234ottf");
INSERT INTO db_springouting.user(name, password) VALUES ("kate","1234ottf");

INSERT INTO db_springouting.activity(title, description) VALUES ("北海公园划船","划船");
INSERT INTO db_springouting.activity(title, description) VALUES ("爬香山","登山");
INSERT INTO db_springouting.activity(title, description) VALUES ("徒步武当山","徒步");

INSERT INTO db_springouting.student(name, email) VALUES ("王飒","ws@gmail.com");
INSERT INTO db_springouting.student(name, email) VALUES ("刘元","ly@163.com");
INSERT INTO db_springouting.student(name, email) VALUES ("赵高","zg@sohu.com");

INSERT INTO db_springouting.apply(activityID, sid, result) VALUES (1,1,TRUE );
INSERT INTO db_springouting.apply(activityID, sid, result) VALUES (1,2,TRUE );
INSERT INTO db_springouting.apply(activityID, sid, result) VALUES (2,1,TRUE );
INSERT INTO db_springouting.apply(activityID, sid, result) VALUES (3,2,TRUE );