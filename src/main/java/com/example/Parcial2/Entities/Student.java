package com.example.Parcial2.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "estudiantes")
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String email;
        @Column(name = "date_of_birth")
        @Temporal(TemporalType.DATE)
        private Date dateOfBirth;

        @Column(name = "created_At")
        @Temporal(TemporalType.DATE)
        private Date createAt;

}

