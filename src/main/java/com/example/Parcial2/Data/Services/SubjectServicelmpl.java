package com.example.Parcial2.Data.Services;

import com.example.Parcial2.Dao.SubjectDao;
import com.example.Parcial2.Entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServicelmpl implements SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    @Override
    public List<Subject> findAll() {
        return (List<Subject>) subjectDao.findAll();
    }

    @Override
    public Subject findById(Long id) {
        return subjectDao.findById(id).orElse(null);
    }

    @Override
    public void createSubject(Subject subject) {
        subjectDao.save(subject);
    }

    @Override
    public void updateSubject(Long id, Subject subject) {
        if (subjectDao.existsById(id)) {
            subject.setId(id);
            subjectDao.save(subject);
        }
    }

    @Override
    public void deleteSubject(Long id) {
        if (subjectDao.existsById(id)) {
            subjectDao.deleteById(id);
        }
    }
}
