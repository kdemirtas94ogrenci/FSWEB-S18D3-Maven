package com.workintech.sqlrelations.entity;

import lombok.*;
import jakarta.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "surgery")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nurse_id")
    private long nurseId;

    @Column(name = "patient_id")
    private long patientId;

    @Column(name = "doctor_id")
    private long doctorId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public long getNurseId() {
        return nurseId;
    }

    public void setNurseId(long nurseId) {
        this.nurseId = nurseId;
    }
}
