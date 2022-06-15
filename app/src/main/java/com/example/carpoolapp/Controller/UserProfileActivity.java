package com.example.carpoolapp.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carpoolapp.R;

public class UserProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }
    public void signUp (View v){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }
    public void logOut (View v){
        Intent intent = new Intent(this, com.example.carpoolapp.Controller.AuthActivity.class);
        startActivity(intent);
        finish();
    }
    public void VehicleInfo (View v){
        Intent intent = new Intent(this, VehiclesInfoActivity.class);
        startActivity(intent);
        finish();
    }

    public void AddVehicle (View v){
        Intent intent = new Intent(this, com.example.carpoolapp.Controller.AddVehicleActivity.class);
        startActivity(intent);
        finish();
    }
}