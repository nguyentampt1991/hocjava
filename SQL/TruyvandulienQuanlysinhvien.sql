use quanlysinhvien;
select * from student where StudentName like '%H%';

select * from Class where StartDate like '%12%';

select * from subject where Credit >=3 And Credit<= 5;

update student set ClassID = 2 where StudentID = 2;