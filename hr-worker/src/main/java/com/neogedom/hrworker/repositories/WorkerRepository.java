package com.neogedom.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neogedom.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository <Worker, Long> {
    
}
