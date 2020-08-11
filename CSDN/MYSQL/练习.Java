#1、查询课程编号为“01”的课程比“02”的课程成绩高的所有学生的学号。
SELECT s_id from score s1 inner join score s2 using(s_id)
where s1.s_id=s2.s_id and s1.c_id=‘01’ and s2.c_id=‘02’ and s1.s_score>s2.s_score;

#2、查询平均成绩大于60分的学生的学号和平均成绩
SELECT s_id,avg(s_score) 平均成绩 from score
GROUP BY s_id HAVING avg(s_score)>60;

#3、查询所有学生的学号、姓名、选课数、总成绩
SELECT s_id 学号,s_name 姓名,count(s_id) 选课数,sum(s_score) 总成绩 FROM student inner join score USING(s_id) GROUP BY s_id;