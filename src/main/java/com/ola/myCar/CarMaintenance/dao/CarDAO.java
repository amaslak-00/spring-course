package com.ola.myCar.CarMaintenance.dao;

import com.ola.myCar.CarMaintenance.entity.CarEntity;
import com.ola.myCar.CarMaintenance.model.CarTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<CarEntity, Long> {


}
