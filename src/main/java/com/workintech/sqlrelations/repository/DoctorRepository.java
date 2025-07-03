package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
