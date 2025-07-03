package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {
}
