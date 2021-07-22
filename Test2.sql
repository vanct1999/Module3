create database Test2;
use Test2;
select *
from students

select *
from subjects

select avg (Mark)
from marks

select max(Mark)
from marks

select Mark
from marks
order by Mark desc

ALTER TABLE subjects MODIFY SubjectName VARCHAR(40);

update subjects set SubjectName  = "Day la mon hoc SQL" where (SubjectID = 1)
update subjects set SubjectName  = "Day la mon hoc SQL" where (SubjectID = 2)
update subjects set SubjectName  = "Day la mon hoc SQL" where (SubjectID = 3)
update subjects set SubjectName  = "Day la mon hoc SQL" where (SubjectID = 4)

alter table students
add check (age >15 and age <50);

alter table classstudent
drop foreign key StudentID
drop foreign key ClassID

alter table marks
drop foreign key  StudentID
drop foreign key  SubjectID

delete from students where StudentID = 1;


alter table students
add column Statuss bit default 1;

update students set Statuss = 0 where studentid = 1;
update students set Statuss = 0 where studentid = 2;
update students set Statuss = 0 where studentid = 3;
update students set Statuss = 0 where studentid = 4;
update students set Statuss = 0 where studentid = 5;

