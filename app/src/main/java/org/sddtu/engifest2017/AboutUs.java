package org.sddtu.engifest2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.sddtu.engifest2017.Adapters.AboutUsAdapter;
import org.sddtu.engifest2017.DataProviders.AboutUsData;

import java.util.ArrayList;

import me.anwarshahriar.calligrapher.Calligrapher;

public class AboutUs extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<AboutUsData> arrayList = new ArrayList<AboutUsData>();

    String[] name = {"Amit Phogat","Snehal Toppo","Nalin Choudharuy","Anmol Anand","Aseem Bansal","Gunik Goel","Arpit Nagpal","Akriti Tewari","Dhruv Dua","Shikhar Sachdeva","Piyush Sharma","Sheikh Farhan Raza","Sarthak Rastogi","Divyendu Thakur"};
    String[] designaton = {"President, Student Association","Student Advisor, Student Association","Cultural Advisor, Cultural Council","Student Advisor, Student Association","Student Advisor, Student Association","Cultural Secretary","Joint Cultural Secretary","Joint Cultural Secretary","Treasurer","Joint Treasurer","PG Coordinator","Vice President","General Secretary","Joint Secretary"};
    String[] mobile = {"8802148418","9718441404","8588001179","9582920037","9871539472","9999561252","9899500799","9968110099","9871494923","8447403102","8561961828","9582368279","9582500216","8743982620"};
    int[] images = {R.drawable.amit,R.drawable.snehal,R.drawable.nalin,R.drawable.anmol,R.drawable.aseem,R.drawable.gunik,R.drawable.arpit,R.drawable.akriti,R.drawable.dhruv,R.drawable.shikhar,R.drawable.piyush,R.drawable.sheikh,R.drawable.sarthak,R.drawable.divyendu};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_about_us);

        getSupportActionBar().setTitle("Team Engi");

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        recyclerView  =(RecyclerView)findViewById(R.id.recyc_about);
        int i=0;
        for(String n:name) {
            AboutUsData aboutUsData = new AboutUsData(name[i],designaton[i],mobile[i],images[i]);
            arrayList.add(aboutUsData);
            i++;
        }
        layoutManager = new LinearLayoutManager(AboutUs.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new AboutUsAdapter(AboutUs.this,arrayList);
        recyclerView.setAdapter(adapter);
    }
}
