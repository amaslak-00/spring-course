package com.ola.myCar.CarMaintenance.entity;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "mileage")
    private Long mileage;
    @Column(name = "production_year")
    private int productionYear;
    @Column(name = "color")
    private String color;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "power")
    private int power;


    public CarEntity(Long id, String model, Long mileage, int productionYear, String color, int capacity, int power) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.productionYear = productionYear;
        this.color = color;
        this.capacity = capacity;
        this.power = power;
    }

    protected CarEntity() {

    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Long getMileage() {
        return mileage;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPower() {
        return power;
    }


}
