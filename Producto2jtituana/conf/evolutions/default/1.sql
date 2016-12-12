# --- First database schema

# --- !Ups

create table orden (
  id                        bigint not null,
  nombre                    varchar(255),
  detalle                   varchar(255),
  mesero                    varchar(255),
  precio                	bigint not null,
  
  constraint pk_orden primary key (id))
;


;

create sequence orden_seq start with 1000;



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists orden;


SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists orden_seq;


