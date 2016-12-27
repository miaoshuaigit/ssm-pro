--删除序列
drop sequence user_sequence;

--创建序列
create sequence user_sequence increment by 1 
start with 1 
nomaxvalue 
nocycle 
cache 10;

--创建获取序列的函数
create or replace function get_seq return number 
as 
seq_num number;
begin 
  select user_sequence.nextval into seq_num from dual;
  return (seq_num);
end get_seq;

--创建存储过程，插入10万条数据
create or replace procedure insert_user 
as 
i int;
testid varchar(32);
seqid number;
begin 
  i := 0;
  while(i < 30) 
  loop 
    i := i+1;
    testid := sys_guid();
    seqid := get_seq();
    insert into t_user(id,name,sex) values (testid,'name'||to_char(seqid),'1');
    insert into t_user_role(id,user_id,role_id) values (sys_guid(),testid,'1');
  end loop;
  commit;
end;

--执行存储过程
begin 
 insert_user();
end;

--插入T_ROLE表
create or replace procedure insert_role 
as 
i int;
tmpid varchar(32);
begin 
  i := 0;
  while(i < 6)
  loop
    i := i+1;
    tmpid := sys_guid();
    insert into t_role(id,role_name,role_type,create_time) values (tmpid,'role'||i,'0',sysdate);
  end loop;
  commit;
end;

drop procedure insert_role;

begin 
  insert_role();
end;