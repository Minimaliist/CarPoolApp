package com.example.carpoolapp.Model.Vehicle;

import java.util.ArrayList;

public class Helicopter extends com.example.carpoolapp.Model.Vehicle.Vehicle {
    private int maxAltitude;
    private int maxAirSpeed;


    public Helicopter(){
        super();
    }

    public Helicopter(String owner, String model, int capacity, String vehicleID, ArrayList<String> ridersUIDs, boolean open, String vehicleType, double basePrice, int maxAltitude, int maxAirSpeed) {
        this.maxAltitude = maxAltitude;
        this.maxAirSpeed = maxAirSpeed;
    }

    public Helicopter(String model, int capacity, double basePrice, String vehicleID, String ownerId, int maxAltitude, int maxAirSpeed){
        super(model, capacity, "Helicopter", basePrice, vehicleID, ownerId);
        this.maxAltitude =maxAltitude;
        this.maxAirSpeed=maxAirSpeed;
        this.setVehicleType("Helicopter");
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getMaxAirSpeed() {
        return maxAirSpeed;
    }

    public void setMaxAirSpeed(int maxAirSpeed) {
        this.maxAirSpeed = maxAirSpeed;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "maxAltitude=" + maxAltitude +
                ", maxAirSpeed=" + maxAirSpeed +
                '}';
    }
}
