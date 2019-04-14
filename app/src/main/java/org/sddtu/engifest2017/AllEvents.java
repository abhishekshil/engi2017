package org.sddtu.engifest2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.sddtu.engifest2017.Adapters.EventAdapter;
import org.sddtu.engifest2017.DataProviders.EventData;

import java.util.ArrayList;

import me.anwarshahriar.calligrapher.Calligrapher;

public class AllEvents extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<EventData> arrayList = new ArrayList<EventData>();


    String[] events = {"Dance","Music","Drama","Fashion","Pro Night","Literary","Art(SpectRang)","Miscellaneous","Informal Events"};
    int[] images = {R.drawable.mus,R.drawable.mus1,R.drawable.dram,R.drawable.fash,R.drawable.pnight,
           R.drawable.literary,R.drawable.art,R.drawable.eninfi,R.drawable.informal};
//    int[] images = {R.drawable.mus,R.drawable.mus1,R.drawable.dram,R.drawable.mus,R.drawable.pnight,R.drawable.literary,R.drawable.art,
//            R.drawable.mus,R.drawable.mus,R.drawable.mus,R.drawable.mus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_all_events);

        getSupportActionBar().setTitle("Event Description");
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        recyclerView = (RecyclerView) findViewById(R.id.recyc_events);
        int i = 0;
        for(String n : events) {
            EventData placeCardData = new EventData(events[i],images[i]);
            arrayList.add(placeCardData);
            i++;
        }
        layoutManager = new LinearLayoutManager(AllEvents.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new EventAdapter(getApplicationContext(),arrayList);
        recyclerView.setAdapter(adapter);

    }
}
