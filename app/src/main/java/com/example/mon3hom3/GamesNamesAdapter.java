package com.example.mon3hom3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GamesNamesAdapter extends RecyclerView.Adapter<GamesNamesViewHolder> {
    private ArrayList<String> GamesNamesList;
    public GamesNamesAdapter(ArrayList<String> gamesNamesList){
        this.GamesNamesList = gamesNamesList;

    }

    @NonNull
    @Override
    public GamesNamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GamesNamesViewHolder
                (LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gamenames, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GamesNamesViewHolder holder, int position) {
        holder.bind(GamesNamesList.get(position));

    }

    @Override
    public int getItemCount() {
        return GamesNamesList.size();
    }
}
