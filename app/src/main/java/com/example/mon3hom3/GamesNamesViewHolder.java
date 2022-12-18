package com.example.mon3hom3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class GamesNamesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvGamesNames;


    public GamesNamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvGamesNames = (TextView) itemView.findViewById(R.id.tv_gamenames);
    }
public void bind(String gamesNames){tvGamesNames.setText(gamesNames);}
}

