package com.example.Parcial2.Data.Controllers;

import com.example.Parcial2.Data.Services.SubjectAssignmentsService;
import com.example.Parcial2.Entities.SubjectAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materia_asignada")
public class SubjectAssignmentsController {


    @Autowired
    private SubjectAssignmentsService subjectAssignmentsService;

    @GetMapping
    public List<SubjectAssignment> getSubjectAssignments() {
        return subjectAssignmentsService.findAll();
    }

    @GetMapping("/{param}")
    public SubjectAssignment getSubjectAssignmentsBy(@PathVariable Long param) {
        try {
            return subjectAssignmentsService.findBySubjectId(param);
        } catch (Exception e) {
            return subjectAssignmentsService.findByStudentId(param);
        }
    }

    @PostMapping
    public void createSubjectAssignments(@RequestBody SubjectAssignment subjectAssignments) {
        subjectAssignmentsService.createSubjectAssignments(subjectAssignments);
    }

    @PutMapping("/{id}")
    public void updateSubjectAssignments(@PathVariable Long id, @RequestBody SubjectAssignment subjectAssignments) {
        subjectAssignmentsService.updateSubjectAssignments(id, subjectAssignments);
    }

    @DeleteMapping("/{id}")
    public void deleteSubjectAssignments(@PathVariable Long id) {
        subjectAssignmentsService.deleteSubjectAssignments(id);
    }
}
