package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
}
