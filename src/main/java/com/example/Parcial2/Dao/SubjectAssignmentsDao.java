package com.example.Parcial2.Dao;

import com.example.Parcial2.Entities.SubjectAssignment;
import org.springframework.data.repository.CrudRepository;

public interface SubjectAssignmentsDao  extends CrudRepository<SubjectAssignment, Long> {

    SubjectAssignment findBySubjectId(Long subjectId);
    SubjectAssignment findByStudentId(Long studentId);

}
