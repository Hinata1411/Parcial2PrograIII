insert into student (name, email, date_of_birth, created_at) values ('Pedro', 'pedrojuarez@gmail.com', '1897-05-02', NOW());
insert into materias (name, professor_name) values ('Ciencias naturales', 'Seño Marta');
insert into materias_asignadas (subject_id, student_id, created_at) values (1, 1, NOW());