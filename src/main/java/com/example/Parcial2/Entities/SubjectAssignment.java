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

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public Long getStudentId() {
                return studentId;
        }

        public void setStudentId(Long studentId) {
                this.studentId = studentId;
        }

        public Long getSubjectId() {
                return subjectId;
        }

        public void setSubjectId(Long subjectId) {
                this.subjectId = subjectId;
        }

        public Date getCreatedAt() {
                return createdAt;
        }

        public void setCreatedAt(Date createdAt) {
                this.createdAt = createdAt;
        }
}

