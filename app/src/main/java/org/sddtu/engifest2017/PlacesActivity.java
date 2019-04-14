package org.sddtu.engifest2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.sddtu.engifest2017.Adapters.PlaceCard;
import org.sddtu.engifest2017.DataProviders.PlaceCardData;

import java.util.ArrayList;

import me.anwarshahriar.calligrapher.Calligrapher;

public class PlacesActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<PlaceCardData> arrayList = new ArrayList<PlaceCardData>();

    String[] places = {"Open Air Theatre(OAT)","Food City","Sports Complex","BR Ambedkar Auditorium"};
    String[] s = {"Hub of all events under the sky roof.","Hot to cold , Made and Sold.","Run.Smash.Loft.Aim.Win","Stage is set.Lights are flashing. Are you?"};
    //String[] info = {s,s,s,s};
    int[] imagesrc = {R.drawable.bigoat,R.drawable.fcity,R.drawable.sportc,R.drawable.braudi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   //     this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_places);

        getSupportActionBar().setTitle("Explore DTU");

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        recyclerView = (RecyclerView) findViewById(R.id.recyc_places);
        int i = 0;
        for(String n : places) {
            PlaceCardData placeCardData = new PlaceCardData(places[i],s[i],imagesrc[i]);
            arrayList.add(placeCardData);
            i++;
        }
        layoutManager = new LinearLayoutManager(PlacesActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new PlaceCard(PlacesActivity.this,arrayList);
        recyclerView.setAdapter(adapter);
    }
}
