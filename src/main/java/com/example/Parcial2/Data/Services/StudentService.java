package com.example.Parcial2.Data.Services;

import com.example.Parcial2.Entities.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();
    public Student findById(Long id);
    public void createStudent(Student student);
    public void updateStudent(Long id, Student student);
    public void deleteStudent(Long id);

}
