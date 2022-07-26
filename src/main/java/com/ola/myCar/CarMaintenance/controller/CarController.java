package com.ola.myCar.CarMaintenance.controller;


import com.ola.myCar.CarMaintenance.entity.CarEntity;
import com.ola.myCar.CarMaintenance.service.CarService;
import com.ola.myCar.CarMaintenance.model.CarTO;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping()
    public List<CarTO> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("{id}")
    public CarTO getCarById(@PathVariable("id") long id) throws Exception {
        return carService.findCarById(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteCarById(@PathVariable("id") long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public CarEntity addCar(@RequestBody CarTO carTO) {
        return carService.addToDB(carTO);
    }

    @PutMapping("{id}")
    public CarEntity updateCar(@RequestBody CarTO carTO, @PathVariable Long id) {
        return carService.updateDB(id, carTO);
    }

}
