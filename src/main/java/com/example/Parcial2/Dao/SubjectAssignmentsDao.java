package com.example.Parcial2.Dao;

import com.example.Parcial2.Entities.SubjectAssignment;

public interface SubjectAssignmentsDao  extends CrudRepository<SubjectAssignment, Long>  {

    SubjectAssignment findBySubjectId(Long subjectId);
    SubjectAssignment findByStudentId(Long studentId);

}
