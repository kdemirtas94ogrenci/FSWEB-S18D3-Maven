package com.workintech.sqlrelations.entity;

import lombok.*;
import jakarta.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String email;
    private String complaint;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}
