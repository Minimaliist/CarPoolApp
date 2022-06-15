package com.example.carpoolapp.Model.Vehicle;

public class Car extends com.example.carpoolapp.Model.Vehicle.Vehicle {

    private int range;
    /*
       public Helicopter(String model, int capacity, double basePrice, String vehicleID, String ownerId, int maxAltitude, int maxAirSpeed){
        super(model, capacity, "Helicopter", basePrice, vehicleID, ownerId);
        this.maxAltitude =maxAltitude;
        this.maxAirSpeed=maxAirSpeed;
        this.setVehicleType("Helicopter");
    }
    */
    public Car(String model, int capacity, double basePrice, String vehicleID, String ownerId, int range){
        super(model, capacity, "Car", basePrice, vehicleID, ownerId);
        this.range =range;
        this.setVehicleType("Car");
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Car{" +
                "range=" + range +
                '}';
    }
}