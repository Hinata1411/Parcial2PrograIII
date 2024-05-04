insert into students (name, email, date_of_birth, created_at) values ('Pedro', 'pedrojuarez@gmail.com', '1897-05-02', NOW());
insert into subjects (name, professor_name) values ('Ciencias naturales', 'Seño Marta');
insert into subject_assignments (subject_id, student_id, created_at) values (1, 1, NOW());