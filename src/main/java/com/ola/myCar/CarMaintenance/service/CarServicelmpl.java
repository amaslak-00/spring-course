package com.ola.myCar.CarMaintenance.service;

import com.ola.myCar.CarMaintenance.entity.CarEntity;
import com.ola.myCar.CarMaintenance.dao.CarDAO;
import com.ola.myCar.CarMaintenance.model.CarTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServicelmpl implements CarService {

    @Autowired
    private CarDAO carDAO;


    @Override
    public List<CarTO> getAllCars() {
        return carDAO.findAll()
                .stream()
                .map(this::mapToCarTO)
                .collect(Collectors.toList());
    }

    private CarTO mapToCarTO(CarEntity carEntity) {
        return new CarTO(carEntity.getId(),
                carEntity.getModel(),
                carEntity.getMileage(),
                carEntity.getProductionYear(),
                carEntity.getColor(),
                carEntity.getCapacity(),
                carEntity.getPower());
    }

    private CarEntity mapToCarEntity(CarTO carTO) {
        return new CarEntity(carTO.getId(),
                carTO.getModel(),
                carTO.getMileage(),
                carTO.getProductionYear(),
                carTO.getColor(),
                carTO.getCapacity(),
                carTO.getPower());
    }

    @Override
    public CarTO findCarById(Long id) throws Exception {
        /*Optional - protects us from getting null*/
        Optional<CarEntity> findCarTO = carDAO.findById(id);
        if (findCarTO.isPresent())
            return mapToCarTO(findCarTO.get());
        else
            throw new Exception("Car is not in database");

    }

    @Override
    public void deleteCar(long id) {
        Optional<CarEntity> findCarTO = carDAO.findById(id);
        if (findCarTO.isPresent()) {
            carDAO.deleteById(id);
        }
    }

    @Override
    public CarEntity addToDB(CarTO carTO) {
        return carDAO.save(mapToCarEntity(carTO));
    }

    @Override
    public CarEntity updateDB(Long id, CarTO carTO) {
        return carDAO.save(mapToCarEntity(carTO));
    }


}
