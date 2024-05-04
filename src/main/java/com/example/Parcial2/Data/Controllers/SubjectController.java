package com.example.Parcial2.Data.Controllers;

import com.example.Parcial2.Data.Services.SubjectService;
import com.example.Parcial2.Entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materia")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getSubjects() {
        return subjectService.findAll();
    }

    @GetMapping("/{id}")
    public Subject getSubject(@PathVariable Long id) {
        return subjectService.findById(id);
    }

    @PostMapping
    public void createSubject(@RequestBody Subject subject) {
        subjectService.createSubject(subject);
    }

    @PutMapping("/{id}")
    public void updateSubject(@PathVariable Long id, @RequestBody Subject subject) {
        subjectService.updateSubject(id, subject);
    }

    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectService.deleteSubject(id);
    }



}
