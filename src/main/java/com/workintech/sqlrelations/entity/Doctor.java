package com.workintech.sqlrelations.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String proficiency;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
