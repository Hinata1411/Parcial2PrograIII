package com.example.Parcial2.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "student")
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

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public Date getDateOfBirth() {
                return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
        }

        public Date getCreateAt() {
                return createAt;
        }

        public void setCreateAt(Date createAt) {
                this.createAt = createAt;
        }
}

