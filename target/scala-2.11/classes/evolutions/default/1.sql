# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table review (
  id                        serial not null,
  poster_id                 integer,
  poster_name               varchar(255),
  tool_id                   integer,
  body                      text,
  posted_on                 timestamp,
  constraint pk_review primary key (id))
;

create table sub_tool_category (
  id                        serial not null,
  name                      varchar(255),
  image_link                varchar(255),
  category_id               integer,
  constraint pk_sub_tool_category primary key (id))
;

create table tool (
  id                        serial not null,
  name                      varchar(255),
  owner_id                  integer,
  image_link                varchar(255),
  is_available              varchar(255),
  description               text,
  specification             text,
  category_id               integer,
  subcategory_id            integer,
  price                     float,
  sub_category_id           integer,
  constraint pk_tool primary key (id))
;

create table tool_category (
  id                        serial not null,
  name                      varchar(255),
  image_link                varchar(255),
  constraint pk_tool_category primary key (id))
;

create table tool_user (
  id                        serial not null,
  username                  varchar(255),
  password_hash             varchar(255),
  email                     varchar(255),
  image_link                varchar(255),
  phone                     varchar(255),
  add                       varchar(255),
  constraint pk_tool_user primary key (id))
;

alter table sub_tool_category add constraint fk_sub_tool_category_category_1 foreign key (category_id) references tool_category (id);
create index ix_sub_tool_category_category_1 on sub_tool_category (category_id);
alter table tool add constraint fk_tool_subCategory_2 foreign key (sub_category_id) references sub_tool_category (id);
create index ix_tool_subCategory_2 on tool (sub_category_id);



# --- !Downs

drop table if exists review cascade;

drop table if exists sub_tool_category cascade;

drop table if exists tool cascade;

drop table if exists tool_category cascade;

drop table if exists tool_user cascade;

