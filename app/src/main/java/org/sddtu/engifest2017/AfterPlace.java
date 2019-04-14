package org.sddtu.engifest2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.sddtu.engifest2017.Adapters.ListViewAdapter;
import org.sddtu.engifest2017.DataProviders.ListViewData;

public class AfterPlace extends AppCompatActivity {


    String[] events,time,date;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_place);
        this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        listView = (ListView) findViewById(R.id.list_venue);


        events = new String[]{"Engi-Idol","Vocalicious","BallaDeers","Vrind","Two's a show","Acoustic Alchemy"};
        time = new String[]{"Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle"};
        date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17","19 Feb'17","18 Feb'17"};

        ListViewAdapter listViewAdapter = new ListViewAdapter(getApplicationContext(),R.layout.custom_listview);
        listView.setAdapter(listViewAdapter);
        for(int i=0;i<events.length;i++)
        {
            ListViewData data = new ListViewData(events[i],date[i],time[i]);
            listViewAdapter.add(data);
        }
    }
}
