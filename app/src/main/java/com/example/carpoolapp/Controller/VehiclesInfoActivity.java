package com.example.carpoolapp.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carpoolapp.Model.Vehicle.Vehicle;
import com.example.carpoolapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class VehiclesInfoActivity extends AppCompatActivity implements RecViewAdapter.OnNoteListener {
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private FirebaseFirestore firestore;
    private RecyclerView recView;
    private ArrayList<Vehicle> vehiclesList;
    private RecViewAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_info);

        firestore = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();

        vehiclesList = new ArrayList<>();

        recView = findViewById(R.id.VehiclesInfo_recView);

        getVehicles();
    }

    public void getVehicles() {
        TaskCompletionSource<String> getAllRidesTask = new TaskCompletionSource<>();

        firestore.collection("Vehicle").whereEqualTo("open", true)
                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful() && task.getResult() != null) {
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        vehiclesList.add(document.toObject(Vehicle.class));
                    }
                    getAllRidesTask.setResult(null);
                }
                else {
                    Log.d("VehicleInfoActivity", "Error getting documents from db: ", task.getException());
                }
            }
        });

        getAllRidesTask.getTask().addOnCompleteListener(new OnCompleteListener<String>() {
            @Override
            public void onComplete(@NonNull Task<String> task) {
                System.out.println("VEHICLE INFO: " + vehiclesList.toString());
                myAdapter = new RecViewAdapter(vehiclesList, VehiclesInfoActivity.this);
                recView.setAdapter(myAdapter);
                recView.setLayoutManager(new LinearLayoutManager(VehiclesInfoActivity.this));
            }
        });
    }


    public void goToUserProfile(View v) {
        Intent intent = new Intent(this, VehiclesInfoActivity.class);
        startActivity(intent);
    }

    @Override
    public void onNoteClick(int position) {

        Intent intent = new Intent(this, VehicleProfileActivity.class);
        //intent.putExtra("Vehicle", vehiclesList.get(position).getOwnerUID());
        intent.putExtra("Vehicle", (Parcelable) vehiclesList.get(position));
        System.out.println("VEHICLE INFO: " + vehiclesList.toString());
        startActivity(intent);
    }


}