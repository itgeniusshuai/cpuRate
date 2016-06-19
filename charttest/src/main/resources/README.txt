cupData表结构
create table tbl_cpu_data(id int primary key autoincrement,used_byte bigint,total_byte bigint,time bigint)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table tbl_server (id int primary key auto_increment ,ip varchar(24),name varchar(24),pwd varchar(24),server_type int)engine innodb default charset=utf8;