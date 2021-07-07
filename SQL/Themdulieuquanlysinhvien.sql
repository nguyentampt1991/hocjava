insert into Class values (2, 'A2', '2008-12-20', 1) ;
insert into Class values (3, 'A3', '2008-12-21',1 ) ;
insert into Class values (4, 'A4', current_date(), 0) ;

insert into student (StudentName, address, Phone, Status ,ClassID)
value ('nguyễn tuấn tú ', 'nghệ An', '09231773', 1,1);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);

INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
