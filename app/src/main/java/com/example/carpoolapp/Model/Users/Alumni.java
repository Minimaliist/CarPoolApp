package com.example.carpoolapp.Model.Users;

public class Alumni extends User {

    private String graduatedYear;



    public Alumni(String uid, String name, String email, String userType, double priceMultiplier, String graduateYear) {
        super(uid, name, email, userType, priceMultiplier);
        this.graduatedYear = graduateYear;
    }

    public String getGraduateYear() {
        return graduatedYear;
    }

    public void setGraduateYear(String graduateYear) {
        this.graduatedYear = graduateYear;
    }

    @Override
    public String toString() {
        return "Alumni{" +
                "graduateYear='" + graduatedYear + '\'' +
                '}';
    }
}