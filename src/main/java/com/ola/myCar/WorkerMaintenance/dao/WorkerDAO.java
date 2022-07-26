package com.ola.myCar.WorkerMaintenance.dao;

import com.ola.myCar.WorkerMaintenance.entity.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerDAO extends JpaRepository<WorkerEntity, Long> {
}
