package org.sddtu.engifest2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.sddtu.engifest2017.Adapters.EventListAdapter;
import org.sddtu.engifest2017.Adapters.ListViewAdapter;
import org.sddtu.engifest2017.DataProviders.EventProvider;
import org.sddtu.engifest2017.DataProviders.ListViewData;

public class BeforeMaster extends AppCompatActivity {

    ListView listView;
    String[] events,date,time,venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_before_master);

        String s = getIntent().getStringExtra("Choose");
        getSupportActionBar().setTitle(s);

        if(s.equals("Dance")){
            events = new String[]{"Spandan","Anushtaan","Switch the funk up"};
            venue = new String[]{"SOLO(OAT) GROUP(AUDI)","B R Ambedkar Auditorium","OAT"};
            time = new String[]{"10am","10am","10am"};
            date = new String[]{"19 Feb'17","18 Feb'17","20 Feb'17"};
        } else if(s.equals("Music")) {
            events = new String[]{"Engi-Idol","Vocalicious","BallaDeers","Vrind","Two's A Show","Acoustic Alchemy"};
            venue = new String[]{"Convo Hall","Convo Hall","Convo Hall","Convo Hall","Convo Hall","Wind Point"};
            time = new String[]{"2pm","2pm","9am","9am","10am","2pm"};
            date = new String[]{"19 Feb'17","18 Feb'17","18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17"};
        } else if(s.equals("Miscellaneous")) {
            events = new String[]{"Film-Making Kaleidoscope","ShakeDown","StandUp Comedy","Kavi Sammelan","Arte Fotographia"};
            venue = new String[]{"SPS 13","Hostel Road","Auditorium","OAT",""};
            time = new String[]{"10am","12pm","5pm - 7pm","4pm",""};
            date = new String[]{"19 Feb'17","18 Feb'17","18 Feb'17","19 Feb'17",""};
        } else if(s.equals("Literary")){
            events = new String[]{"War of Words","Creative Writing","Mixed Bag","Kavyanjana","JAM(Just a Minute)","DrishtiKon"};
            venue = new String[]{"SPS Hall","SPS Hall","SPS Hall","SPS Hall","SPS Hall","SPS Hall"};
            time = new String[]{"10am - 5pm","3pm - 5pm","2pm - 4pm","11am - 1pm","10am - 5pm","10am - 2pm",""};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17","19 Feb'17","18 Feb'17",""};
        } else if(s.equals("Pro Night")){
            events = new String[]{"Live Wire","EDM Night-NUCLEYA","Rock Night"};
            venue = new String[]{"Sports Complex","Sports Complex","Sports Complex","B R Ambedkar Auditorium","B R Ambedkar Auditorium","B R Ambedkar Auditorium"};
            time = new String[]{"7pm onwards","7pm onwards","7pm onwards","Tu daal dalle","Tu daal dalle","Tu daal dalle",""};
            date = new String[]{"18 Feb'17","20 Feb'17","19 Feb'17","19 Feb'17","20 Feb'17","18 Feb'17",""};
        } else if(s.equals("Drama")) {
            events = new String[]{"Nukkad","Natya",};
            venue = new String[]{"MechC Parking(Prelims - 14th Feb)","Auditorium"};
            time = new String[]{"10am","10am"};
            date = new String[]{"19 Feb'17","20 Feb'17"};
        } else if(s.equals("Fashion")){
            events = new String[]{"Paridhan","The Selfie Brag"};
            venue = new String[]{"Sports Complex",""};
            time = new String[]{"4pm",""};
            date = new String[]{"19 Feb'17",""};
        } else if(s.equals("Art(SpectRang)")) {
            events = new String[]{"Shoe painting","Art & Furious","3 Dimensional Art"};
            venue = new String[]{"Edusat Hall","Edusat Hall","Edusat Hall"};
            time = new String[]{"10am","11am","11am"};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17"};
        }
        else if(s.equals("Informal")) {
            events = new String[]{"Poker","Zorbing","Cricket Simulation","Vr Theatre","Paintball","Segway"};
            venue = new String[]{"Funcity","Funcity","Funcity","Funcity","Funcity","Funcity"};
            time = new String[]{"11am","11am","11am","11am","11am","11am"};
            date = new String[]{"18-20 Feb'17","18-20 Feb'17","18-20 Feb'17","18-20 Feb'17","18-20 Feb'17","18-20 Feb'17"};
        }

        listView = (ListView)findViewById(R.id.list_event1);
        EventListAdapter eventListAdapter = new EventListAdapter(getApplicationContext(),R.layout.cutom_alert_list);
        listView.setAdapter(eventListAdapter);
        for(int i=0;i<events.length;i++)
        {
            EventProvider data = new EventProvider(events[i],venue[i],time[i],date[i]);
            eventListAdapter.add(data);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view  = parent.getChildAt(position);
                        TextView textView = (TextView)view.findViewById(R.id.list_event);
        String a = textView.getText().toString();
        Log.d("A",a);
        Intent intent = new Intent(BeforeMaster.this,MasterEventActivity.class);
        intent.putExtra("Chosen",a);
        if(a.equals("Poker")||a.equals("Zorbing")||a.equals("Cricket Simulation")||a.equals("Vr Theatre")||a.equals("Paintball")
                ||a.equals("Segway")){

        }else if(a.equals("Engi-Idol")||a.equals("Vocalicious")||a.equals("BallaDeers")||a.equals("Vrind")||a.equals("Two's A Show")
                ||a.equals("Acoustic Alchemy")||a.equals("Live Wire")||a.equals("EDM Night-NUCLEYA")||a.equals("Rock Night")){
            Intent intent1 = new Intent(BeforeMaster.this,Doremipa.class);
            intent1.putExtra("Chosen",a);
            startActivity(intent1);
        }
        else
        startActivity(intent);
            }
        });
    }
}

