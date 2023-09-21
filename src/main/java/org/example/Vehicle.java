package org.example;

public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEffeciency;

    public Vehicle(String make, String model, int year, String fuelType, double fuelEffeciency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEffeciency = fuelEffeciency;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEffeciency() {
        return fuelEffeciency;
    }

    public abstract double calculateEffeciency();

    public abstract double calculateDistance();

    public abstract double geetMaxSpeed();

    @Override
    public String toString() {
        return "Truck [Make: " + make + ", Model: " + model + ", Year: " + year +
                ", Fuel Type: " + fuelType + ", Mileage: ";
    }
}
