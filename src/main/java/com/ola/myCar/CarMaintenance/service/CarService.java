package com.ola.myCar.CarMaintenance.service;

import com.ola.myCar.CarMaintenance.entity.CarEntity;
import com.ola.myCar.CarMaintenance.model.CarTO;

import java.util.List;

public interface CarService {

    List<CarTO> getAllCars();

    CarTO findCarById(Long id) throws Exception;

    void deleteCar(long id);

    CarEntity addToDB(CarTO carTO);

    CarEntity updateDB(Long id, CarTO carTO);
}
