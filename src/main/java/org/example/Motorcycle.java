package org.example;

public class Motorcycle extends Vehicle{

    private double engineDisplacement;
    public Motorcycle(String make, String model, int year, String fuelType, double fuelEffeciency) {
        super(make, model, year, fuelType, fuelEffeciency);
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }
    @Override
    public double calculateEffeciency() {
        return engineDisplacement;
    }

    @Override
    public double calculateDistance() {
        return getFuelEffeciency() * (1.0 / (1.0 * (getEngineDisplacement() / 100.00)));
    }

    @Override
    public double geetMaxSpeed() {
        return 200.00;
    }
}
