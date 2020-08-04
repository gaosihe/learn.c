#建立学生表 编号（主键） 学生姓名 生日 性别
CREATE TABLE student(
s_id int PRIMARY key auto_increment,
s_name VARCHAR(20) not null,
s_birthday VARCHAR(20) not null,
s_sex VARCHAR(20) not null
);

#建立课程表 编号（主键） 课程名 教师
CREATE TABLE course(
c_id int auto_increment,
c_name VARCHAR(20) not null,
t_id int not null,
PRIMARY KEY(c_id)
);

#建立教师表 编号（主键）教师姓名
CREATE TABLE teacher(
t_id int auto_increment ,
t_name VARCHAR(20) not null,
PRIMARY key(t_id)
);

#建立成绩表 编号（主键） 课程编号（主键） 成绩
CREATE TABLE score(
s_id int ,
c_id int ,
s_score FLOAT(4,2),
PRIMARY KEY(s_id,c_id)
);