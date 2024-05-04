package com.example.Parcial2.Data.Services;

import com.example.Parcial2.Entities.SubjectAssignment;

import java.util.List;

public interface SubjectAssignmentsService {

    public List<SubjectAssignment> findAll();
    public SubjectAssignment findById(Long id);
    public SubjectAssignment findBySubjectId(Long subjectId);
    public SubjectAssignment findByStudentId(Long studentId);
    public void createSubjectAssignments(SubjectAssignment subjectAssignments);
    public void updateSubjectAssignments(Long id, SubjectAssignment subjectAssignment);
    public void deleteSubjectAssignments(Long id);

}
