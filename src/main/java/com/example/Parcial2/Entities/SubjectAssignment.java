package com.example.Parcial2.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "materias_asignadas")
public class SubjectAssignment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Long studentId;
        private Long subjectId;
        @Column(name = "created_at")
        @Temporal(TemporalType.DATE)
        private Date createdAt;

}

