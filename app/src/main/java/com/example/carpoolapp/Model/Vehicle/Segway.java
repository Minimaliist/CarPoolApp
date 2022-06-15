package com.example.carpoolapp.Model.Vehicle;

public class Segway extends Vehicle{
    private int range;
    private int weightCapacity;


    public Segway(String model, int capacity, double basePrice, String vehicleID, String ownerId, int range, int weightCapacity){
        super(model, capacity, "Segway", basePrice, vehicleID, ownerId);
        this.range =range;
        this.weightCapacity=weightCapacity;
        this.setVehicleType("Segway");
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString() {
        return "Segway{" +
                "range=" + range +
                ", weightCapacity=" + weightCapacity +
                '}';
    }
}
