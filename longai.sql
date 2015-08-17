/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/8/17 16:38:11                           */
/*==============================================================*/


drop table if exists enroll;

drop table if exists event;

drop table if exists message;

drop table if exists moment;

drop table if exists momentcomment;

drop table if exists momentlike;

drop table if exists news;

drop table if exists newscomment;

drop table if exists newslike;

drop table if exists user;

/*==============================================================*/
/* Table: enroll                                                */
/*==============================================================*/
create table enroll
(
   enroll_sid           int not null auto_increment,
   event_sid            int,
   user_sid             int,
   enroll_id            int,
   primary key (enroll_sid)
);

/*==============================================================*/
/* Table: event                                                 */
/*==============================================================*/
create table event
(
   event_sid            int not null auto_increment,
   event_id             varchar(10),
   title                varchar(20),
   sponsors             varchar(30),
   starttime            datetime,
   endtime              datetime,
   status               varchar(20),
   contenturl           varchar(200),
   permission           varchar(10),
   location             varchar(200),
   primary key (event_sid)
);

/*==============================================================*/
/* Table: message                                               */
/*==============================================================*/
create table message
(
   message_sid          int not null auto_increment,
   message_id           varchar(10),
   "from"               varchar(30),
   to                   varchar(30),
   status               varchar(20),
   sendtime             datetime,
   receivetime          datetime,
   primary key (message_sid)
);

/*==============================================================*/
/* Table: moment                                                */
/*==============================================================*/
create table moment
(
   moment_id            int not null auto_increment,
   moment_content       varchar(200),
   moment_pubtime       datetime,
   primary key (moment_id)
);

/*==============================================================*/
/* Table: momentcomment                                         */
/*==============================================================*/
create table momentcomment
(
   momentcomment_id     int not null auto_increment,
   user_sid             int,
   moment_id            int,
   momentcommentcontent varchar(200),
   momentcontentpubtime datetime,
   primary key (momentcomment_id)
);

/*==============================================================*/
/* Table: momentlike                                            */
/*==============================================================*/
create table momentlike
(
   moment_id            int,
   user_sid             int,
   momentlike_id        int not null auto_increment,
   momentlikepubtime    datetime,
   primary key (momentlike_id)
);

/*==============================================================*/
/* Table: news                                                  */
/*==============================================================*/
create table news
(
   news_id              int not null auto_increment,
   content              varchar(1000),
   auther               varchar(20),
   title                varchar(20),
   primary key (news_id)
);

/*==============================================================*/
/* Table: newscomment                                           */
/*==============================================================*/
create table newscomment
(
   newscomment_id       int not null auto_increment,
   news_id              int,
   user_sid             int,
   comment_contet       varchar(200),
   pubtime              datetime,
   primary key (newscomment_id)
);

/*==============================================================*/
/* Table: newslike                                              */
/*==============================================================*/
create table newslike
(
   newslike_id          int not null auto_increment,
   user_sid             int,
   news_id              int,
   newslike_pubtime     char(10),
   primary key (newslike_id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   name                 varchar(50),
   nickname             varchar(50),
   email                varchar(100),
   location             varchar(200),
   biography            varchar(200),
   profilepic           varchar(200),
   gender               varchar(10),
   type                 varchar(20),
   preferencegens       double,
   selfgens             double,
   Attribute_51         char(10),
   user_sid             int not null auto_increment,
   user_id              varchar(10),
   primary key (user_sid)
);

alter table enroll add constraint FK_Relationship_2 foreign key (user_sid)
      references user (user_sid) on delete restrict on update restrict;

alter table enroll add constraint FK_Relationship_3 foreign key (event_sid)
      references event (event_sid) on delete restrict on update restrict;

alter table momentcomment add constraint FK_Relationship_6 foreign key (user_sid)
      references user (user_sid) on delete restrict on update restrict;

alter table momentcomment add constraint FK_Relationship_9 foreign key (moment_id)
      references moment (moment_id) on delete restrict on update restrict;

alter table momentlike add constraint FK_Relationship_7 foreign key (user_sid)
      references user (user_sid) on delete restrict on update restrict;

alter table momentlike add constraint FK_Relationship_8 foreign key (moment_id)
      references moment (moment_id) on delete restrict on update restrict;

alter table newscomment add constraint FK_Relationship_10 foreign key (news_id)
      references news (news_id) on delete restrict on update restrict;

alter table newscomment add constraint FK_Relationship_4 foreign key (user_sid)
      references user (user_sid) on delete restrict on update restrict;

alter table newslike add constraint FK_Relationship_11 foreign key (news_id)
      references news (news_id) on delete restrict on update restrict;

alter table newslike add constraint FK_Relationship_5 foreign key (user_sid)
      references user (user_sid) on delete restrict on update restrict;

