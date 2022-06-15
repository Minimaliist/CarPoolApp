package com.example.carpoolapp.Controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carpoolapp.Model.Vehicle.Vehicle;
import com.example.carpoolapp.R;

import java.util.ArrayList;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewHolder> {

    private ArrayList<Vehicle> vehicleList;
    private OnNoteListener onNoteListener;

    public RecViewAdapter(ArrayList<Vehicle> vehicleList, OnNoteListener onNoteListener) {
        this.vehicleList = vehicleList;
        this.onNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_vie, parent, false);
        RecViewHolder holder = new RecViewHolder(myView,onNoteListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.carpoolapp.Controller.RecViewHolder holder, int position) {
        holder.setModelTextView(vehicleList.get(position).getModel());
        holder.setVehicleTypeTextView(vehicleList.get(position).getVehicleType());
        holder.setCapacityTextView("Capacity: "+vehicleList.get(position).getCapacity());
        holder.setBasePriceTextView("$"+vehicleList.get(position).getBasePrice());
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public interface OnNoteListener {
        void onNoteClick(int position);
    }
}
