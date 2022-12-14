drop database if exists  hd;#如果存在hd，删除
create database if not exists hd;#如果不存在hd，创建

use hd;#使用hd作为当前数据库

#创建部门表
drop table if exists department;
create table if not exists department(
                                         did integer auto_increment comment '部门id',
                                         dname varchar(20) not null unique comment '部门名称',
                                         duptime timestamp default  current_timestamp on update current_timestamp,
                                         primary key (did)
);
#约束条件
#alter table  department add constraint 'pk_dep' primary key ('did');
insert into department (dname) values ('财务部'),
                                      ('市场部'),
                                      ('研发部'),
                                      ('后勤部')
;
#创建用户表
drop table if exists uuser;
create table if not exists uuser(
                                    uid integer auto_increment comment '用户id',
                                    uname varchar(20) not null comment '用户名称',
                                    ulimit bool not null comment '是否有管理权限',
                                    uuptime timestamp default  current_timestamp on update current_timestamp,
                                    udid integer comment '部门id',
                                    `password` varchar(20) not null comment '密码',
                                    primary key (uid)
);
#约束条件
#alter table  uuser add constraint 'pk_user' primary key ('uid');
alter table  uuser add constraint fk_user_to_dep  foreign key (udid) references department(did);

insert into uuser (uname, ulimit,udid,password ) values ('zs','0','2','123'),
                                                        ('ls','1','2','123'),
                                                        ('ww','0','1','456'),
                                                        ('ml','1','1','789'),
                                                        ('zq','0','1','123')

;

#创建会议室表
drop table if exists meeting_room;
create table if not exists meeting_room(
                                           mid integer auto_increment comment '会议室id',
                                           mname varchar(20) not null comment '会议室名称',
                                           maddress varchar(50) not null comment '会议室地址',
                                           mstate bool not null comment '会议室状态',
                                           time1 bool not null comment '时间段1',
                                           time2 bool not null comment '时间段2',
                                           time3 bool not null comment '时间段3',
                                           time4 bool not null comment '时间段4',
                                           muotime timestamp default  current_timestamp on update current_timestamp,
                                           primary key (mid)
);
#约束条件
#alter table  meeting_room add constraint 'pk_meet' primary key ('mid');

#创建预定表
drop table if exists reserve;
create table if not exists reserve(
                                      rid integer auto_increment comment '预定的流水号',
                                      mrid integer  comment '会议室id',
                                      urid integer  comment '用户id',
                                      rtime integer comment '预定时段',
                                      is_over bool not null comment '是否结束',#1表示结束，0表示未结束
                                      ruptime timestamp default  current_timestamp on update current_timestamp,
                                      primary key (rid)
);
#约束条件。
#alter table  reserve add constraint 'pk_res' primary key ('rid');
alter table  reserve add constraint fk_res_to_meet  foreign key (mrid) references meeting_room(mid);
alter table  reserve add constraint fk_res_to_user foreign key (urid) references uuser(uid);