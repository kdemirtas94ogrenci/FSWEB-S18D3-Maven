package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
}
