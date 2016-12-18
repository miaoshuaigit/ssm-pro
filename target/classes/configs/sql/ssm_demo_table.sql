---------------------------------------------
-- Export file for user SSM_DEMO           --
-- Created by SAGE on 2016/12/18, 23:07:56 --
---------------------------------------------

spool ssm_demo_table.log

prompt
prompt Creating table APPOINTMENT
prompt ==========================
prompt
create table SSM_DEMO.APPOINTMENT
(
  book_id        VARCHAR2(32) not null,
  student_id     VARCHAR2(32) not null,
  appoint_time   TIMESTAMP(6) not null,
  appointment_id VARCHAR2(32)
)
tablespace SSM_DEMO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
create index SSM_DEMO.IDX_APPOINT_TIME on SSM_DEMO.APPOINTMENT (APPOINT_TIME)
  tablespace SSM_DEMO
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SSM_DEMO.APPOINTMENT
  add primary key (BOOK_ID, STUDENT_ID)
  using index 
  tablespace SSM_DEMO
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table BOOK
prompt ===================
prompt
create table SSM_DEMO.BOOK
(
  book_id VARCHAR2(32) not null,
  name    VARCHAR2(100) not null,
  num     NUMBER(11) not null
)
tablespace SSM_DEMO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SSM_DEMO.BOOK
  add primary key (BOOK_ID)
  using index 
  tablespace SSM_DEMO
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table DEMO
prompt ===================
prompt
create table SSM_DEMO.DEMO
(
  id              VARCHAR2(32),
  team_name_en    VARCHAR2(50),
  team_name_zh    VARCHAR2(50),
  team_rank       NUMBER(2),
  team_createtime DATE
)
tablespace SSM_DEMO
  pctfree 10
  initrans 1
  maxtrans 255;

prompt
prompt Creating table W_USER
prompt =====================
prompt
create table SSM_DEMO.W_USER
(
  id       VARCHAR2(40),
  username VARCHAR2(50),
  psw      VARCHAR2(50)
)
tablespace SSM_DEMO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table W_VISIT_URL_INFO
prompt ===============================
prompt
create table SSM_DEMO.W_VISIT_URL_INFO
(
  id            VARCHAR2(32),
  user_id       VARCHAR2(32),
  visit_url     VARCHAR2(50),
  visit_time    TIMESTAMP(6),
  visit_ip      VARCHAR2(20),
  visit_country VARCHAR2(50),
  leave_time    TIMESTAMP(6),
  visit_count   NUMBER(10)
)
tablespace SSM_DEMO
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table SSM_DEMO.W_VISIT_URL_INFO
  is '������Ϣ��';
comment on column SSM_DEMO.W_VISIT_URL_INFO.id
  is '����ID';
comment on column SSM_DEMO.W_VISIT_URL_INFO.user_id
  is '�����û�ID';
comment on column SSM_DEMO.W_VISIT_URL_INFO.visit_url
  is '�û�����URL';
comment on column SSM_DEMO.W_VISIT_URL_INFO.visit_time
  is '����ʱ��';
comment on column SSM_DEMO.W_VISIT_URL_INFO.visit_ip
  is '�����û���IP';
comment on column SSM_DEMO.W_VISIT_URL_INFO.visit_country
  is '�����û��Ĺ���';
comment on column SSM_DEMO.W_VISIT_URL_INFO.leave_time
  is '�뿪��URL��ʱ��';
comment on column SSM_DEMO.W_VISIT_URL_INFO.visit_count
  is '���ʸ�URL�Ĵ���';


spool off
