package com.example.Parcial2.Dao;

import com.example.Parcial2.Entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Long> {

}
