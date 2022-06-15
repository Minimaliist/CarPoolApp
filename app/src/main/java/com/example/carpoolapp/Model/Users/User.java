package com.example.carpoolapp.Model.Users;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String uid;
    private String name;
    private String email;
    private String userType;
    private double priceMultiplier;
    private ArrayList ownedVehicle;


    public User(String uid, String name, String email, String userType, double priceMultiplier) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.priceMultiplier = priceMultiplier;
        this.ownedVehicle = new ArrayList();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }

    public void setPriceMultiplier(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public ArrayList getOwnedVehicle() {
        return ownedVehicle;
    }

    public void setOwnedVehicle(ArrayList ownedVehicle) {
        this.ownedVehicle = ownedVehicle;
    }



    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userType='" + userType + '\'' +
                ", priceMultiplier=" + priceMultiplier +
                ", ownedVehicle=" + ownedVehicle +
                '}';
    }
}