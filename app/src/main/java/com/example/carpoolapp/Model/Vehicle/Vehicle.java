package com.example.carpoolapp.Model.Vehicle;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehicle implements Serializable, Parcelable {
    private String model;
    private int capacity;
    private String vehicleID;
    private ArrayList<String> ridersUIDs;
    private boolean isOpen;
    private String vehicleType;
    private double basePrice;
    private String ownerUID;

    public Vehicle() {

    }

    public Vehicle(String model, int capacity, String vehicleType, double basePrice, String vehicleID, String ownerUID) {
        this.model = model;
        this.capacity = capacity;
        this.vehicleType = vehicleType;
        this.basePrice = basePrice;
        this.vehicleID = vehicleID;
        this.ownerUID = ownerUID;
        this.isOpen = true;
        this.ridersUIDs = new ArrayList();
    }


    protected Vehicle(Parcel in) {
        model = in.readString();
        capacity = in.readInt();
        vehicleID = in.readString();
        ridersUIDs = in.createStringArrayList();
        isOpen = in.readByte() != 0;
        vehicleType = in.readString();
        basePrice = in.readDouble();
        ownerUID = in.readString();
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    public void addRidersUIDs(String riderUID)
    {
        this.ridersUIDs.add(riderUID);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public ArrayList<String> getRidersUIDs() {
        return ridersUIDs;
    }

    public void setRidersUIDs(ArrayList<String> ridersUIDs) {
        this.ridersUIDs = ridersUIDs;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                ", vehicleID='" + vehicleID + '\'' +
                ", ridersUIDs=" + ridersUIDs +
                ", open=" + isOpen +
                ", vehicleType='" + vehicleType + '\'' +
                ", basePrice='" + basePrice + '\'' +
                ", ownerUID='" + ownerUID + '\'' +
                '}';
    }

    public String getOwnerUID() {
        return ownerUID;
    }

    public void setOwnerUID(String ownerUID) {
        this.ownerUID = ownerUID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(model);
        dest.writeInt(capacity);
        dest.writeString(vehicleID);
        dest.writeStringList(ridersUIDs);
        dest.writeByte((byte) (isOpen ? 1 : 0));
        dest.writeString(vehicleType);
        dest.writeDouble(basePrice);
        dest.writeString(ownerUID);
    }
}
