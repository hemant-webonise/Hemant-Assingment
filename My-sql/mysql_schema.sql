create database if not exists Assessment;

use Assessment;

status;
/*
Creation of tables.
*/
create table users_table(id int not null auto_increment, username char(25) not null, utype boolean, primary key(id));

create table questions_table(id int not null auto_increment, question varchar(50) not null, primary key(id));

create table options_table(id int not null auto_increment, answer varchar(40) not null, is_correct boolean not null, question_id int not null, primary key(id), foreign key(question_id) references questions_table(id) on delete cascade);

create table tests_table(id int not null auto_increment, test_no int not null, question_id int not null, primary key(id), foreign key(question_id) references questions_table(id) on delete cascade);

create table answers_log(id int not null auto_increment, user_id int not null, test_id int not null, question_id int not null, answer int not null, duration int(3) not null, primary key(id), foreign key(user_id) references users_table(id));


/*

Filling values in tables */

insert into users_table values(null, 'Hemant', true);
insert into users_table values(null, 'Siddanth', false);
insert into users_table values(null, 'Akshay', false);
insert into users_table values(null, 'Abhishek', false);



insert into questions_table values(null,'What is total of 1+12?'),(null, 'Which of the tools is used to code Ruby?'),(null, 'Which of the tools is used to execute java code?'),(null, 'What is multiplication of 2*54'),(null, 'HTML java help can be accessed using-'),(null, 'Jar stands for-'),(null, 'which is used for details of compilation?'),(null, 'which of the following is not a keyword in java?'),(null, 'Java is object oriented. Right?'),(null, 'Java code is stored as ?'),(null, 'Which of the following is a invalid comment option ?'),(null, 'What is 15-5?');



insert into options_table values(null, '4', 0, 1), (null, '14', 1, 1),(null, 'java', 0, 2), (null, 'RubyMines', 1, 2),(null, 'java', 1, 3), (null, 'javaw', 0, 3),(null, '110', 0, 4), (null, '108', 1, 4),(null, 'java help', 0, 5), (null, 'javadoc', 1, 5),(null, 'java archive', 1, 6), (null, 'java app runner', 0, 6),(null, 'debug', 0, 7), (null, 'verbose', 1, 7),(null, 'abstract', 0, 8), (null, 'finalize', 1, 8),(null, 'true', 1, 9), (null, 'false', 0, 9),(null, '.jv', 0, 10), (null, '.java', 1, 10),(null, '//', 0, 11), (null, '\\', 1, 11),(null, '12', 0, 12), (null, '5', 1, 12);

/*Cretes two tests with 5 questions and selected out of 13 */
insert into tests_table values(null, 1, 11), (null, 1, 1), (null, 1, 5), (null, 1, 7), (null, 1, 9),
                              (null, 2, 3), (null, 2, 4), (null, 2, 6), (null, 2, 8), (null, 2, 12);

/*Insertion of values for Siddanth for test 1 */

insert into answers_log values(null, 2, 1, 11, 1, 10), (null, 2, 1, 1, 5, 10), (null, 2, 1, 5, 10, 10), (null, 2, 1, 7, 13, 10), (null, 2, 1, 9, 18, 10);

/*Insertion of values for Akshay for test 1 */
insert into answers_log values(null, 3, 1, 11, 2, 10), (null, 3, 1, 1, 5, 10), (null, 3, 1, 5, 10, 10), (null, 3, 1, 7, 14, 10), (null, 3, 1, 9, 17, 10);

/*Insertion of values for Akshay for test 2 */
insert into answers_log values(null, 3, 2, 3, 4, 10), (null, 3, 2, 4, 8, 10), (null, 3, 2, 6, 11, 10), (null, 3, 2, 8, 16, 10), (null, 3, 2, 12, 20, 10);





/*
Problem 2 : 
Creation of View 
*/
create view Assessment_view as select a.user_id, a.test_id,count(*) answer from answers_log a, options_table o where a.answer=o.id and o.is_correct=1 group by a.user_id, a.test_id;


select * from Assessment_view;

/*
Problem 3 : 
Creation of Procedure - Statment
*/


DELIMITER //
CREATE PROCEDURE Report()
BEGIN
SET @sql = NULL;
select group_concat(distinct concat('max(if(td.question_id = ''',question_id,''',IF(td.answer mod 2 = 0, 2, 1),NULL)) as', quote(question_id))) into @sql from answers_log td;
set @sql = concat('select td.user_id,u.username,td.test_id,',@sql,' from answers_log td, users_table u where td.user_id=u.id GROUP BY td.user_id, td.test_id');
prepare statement from @sql;
execute statement;
End//
DELIMITER ;

call Report();
