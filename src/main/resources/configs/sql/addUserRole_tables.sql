create table t_user(
      id varchar(32),
      name varchar(50),
      sex char(1),
      age varchar(3),
      address varchar(200),
      mobile varchar(20),
      create_time timestamp
);

create table t_role(
       id varchar(32),
       role_name varchar(40),
       role_type char(2),
       permission_id varchar(32),
       create_time timestamp
);

create table t_user_role(
       id varchar(32),
       user_id varchar(32),
       role_id varchar(32),
       update_time timestamp
);