package com.ola.myCar.InstitutionMaintenance.dao;

import com.ola.myCar.InstitutionMaintenance.entity.InstitutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionDAO extends JpaRepository<InstitutionEntity, Long> {
}
