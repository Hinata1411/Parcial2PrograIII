package com.example.Parcial2.Data.Services;

import com.example.Parcial2.Dao.SubjectAssignmentsDao;
import com.example.Parcial2.Entities.SubjectAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectAssignmentsServicelmpl implements SubjectAssignmentsService {

    @Autowired
    private SubjectAssignmentsDao subjectAssignmentsDao;

    @Override
    public List<SubjectAssignment> findAll() {
        return (List<SubjectAssignment>) subjectAssignmentsDao.findAll();
    }

    @Override
    public SubjectAssignment findById(Long id) {
        return subjectAssignmentsDao.findById(id).orElse(null);
    }

    @Override
    public SubjectAssignment findBySubjectId(Long subjectId) {
        return subjectAssignmentsDao.findBySubjectId(subjectId);
    }

    @Override
    public SubjectAssignment findByStudentId(Long studentId) {
        return subjectAssignmentsDao.findByStudentId(studentId);
    }

    @Override
    public void createSubjectAssignments(SubjectAssignment subjectAssignments) {
        subjectAssignmentsDao.save(subjectAssignments);
    }

    @Override
    public void updateSubjectAssignments(Long id, SubjectAssignment subjectAssignments) {
        if (subjectAssignmentsDao.existsById(id)) {
            subjectAssignments.setId(id);
            subjectAssignmentsDao.save(subjectAssignments);
        }
    }

    @Override
    public void deleteSubjectAssignments(Long id) {
        if (subjectAssignmentsDao.existsById(id)) {
            subjectAssignmentsDao.deleteById(id);
        }
    }
}
