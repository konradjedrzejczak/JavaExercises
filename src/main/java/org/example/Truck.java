package org.example;

public class Truck extends Vehicle{

    private int numSeats;
    public Truck(String make, String model, int year, String fuelType, double fuelEffeciency, int numSeats) {
        super(make, model, year, fuelType, fuelEffeciency);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }
    @Override
    public double calculateEffeciency() {
        return getFuelEffeciency() * (1.9 / 1.0);
    }

    @Override
    public double calculateDistance() {
        return calculateEffeciency() * getFuelEffeciency();
    }

    @Override
    public double geetMaxSpeed() {
        return 90;
    }


}
