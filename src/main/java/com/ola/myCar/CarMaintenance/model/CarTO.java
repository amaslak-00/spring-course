package com.ola.myCar.CarMaintenance.model;

import javax.persistence.Column;

public class CarTO {
    private String model;
    private long id;
    private long mileage;

    private int productionYear;

    private String color;

    private int capacity;

    private int power;


    public CarTO(long id, String model, long mileage, int productionYear, String color, int capacity, int power) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.productionYear = productionYear;
        this.color = color;
        this.capacity = capacity;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public long getId() {
        return id;
    }

    public long getMileage() {
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
