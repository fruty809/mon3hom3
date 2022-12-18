package com.example.mon3hom3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView gamesNamesRecyclerView;
    private ArrayList<String> GamesNamesList = new ArrayList<>();
    private GamesNamesAdapter adapter = new GamesNamesAdapter(GamesNamesList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        gamesNamesRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        GamesNamesList.add("John Yik");
        GamesNamesList.add("Aspect");
        GamesNamesList.add("Kraken");
        GamesNamesList.add("Killer228");
        GamesNamesList.add("Ya pampers");
        GamesNamesList.add("Giga niga");
        GamesNamesList.add("Antonio Montano");
        GamesNamesList.add("Vitos Colleto");
        GamesNamesList.add("Optimus prime");
        GamesNamesList.add("My names is Gus");
        GamesNamesList.add("Didgey Arbuz");
        GamesNamesList.add("Ego ima robert Polson");
        GamesNamesList.add("Ya ozvuchiwau kanal masterska nastroenie");
    }
}