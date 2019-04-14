package org.sddtu.engifest2017.Fragments;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.sddtu.engifest2017.Adapters.ListViewAdapter;
import org.sddtu.engifest2017.DataProviders.ListViewData;
import org.sddtu.engifest2017.Doremipa;
import org.sddtu.engifest2017.MasterEventActivity;
import org.sddtu.engifest2017.R;

import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link day2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class day2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ListView listView;

    String[] events = {"Vrind","Spandan","Nukkad","Film Making - KaleidoScope","Art & Furious","Kavyanjana","Engi-Idol","Creative Writing",
           "Paridhan","Kavi Sammelan","Rock Night"};
    String[] venue = {"Convo Hall","Solo(OAT) Group(Audi)","MechC Parking PreLims(14th Feb)","SPS 13","EduSat Hall","SPS Hall","Convo Hall","SPS Hall","Sports Complex","OAT"
            ,"Sports Complex"};
    String[] time = {"9am","10am","10am","10am","11am","11am-1pm","2pm","3pm - 5pm","4pm","4pm","7pm onwards"};



    public day2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment day2.
     */
    // TODO: Rename and change types and number of parameters
    public static day2 newInstance(String param1, String param2) {
        day2 fragment = new day2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_day2, container, false);
//        Calligrapher calligrapher = new Calligrapher(getActivity());
//        calligrapher.setFont(getActivity(), "fonts/RobotoCondensed-Light.ttf", true);

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(),"fonts/OpenSans-Light.ttf");

        final TextView textView = (TextView) v.findViewById(R.id.day_2);
        textView.setTypeface(tf);
        listView = (ListView) v.findViewById(R.id.list_view_2);
        ListViewAdapter listViewAdapter = new ListViewAdapter(getActivity(),R.layout.custom_listview);
        listView.setAdapter(listViewAdapter);
        for(int i=0;i<events.length;i++)
        {
            ListViewData data = new ListViewData(events[i],venue[i],time[i]);
            listViewAdapter.add(data);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // view = parent.getChildAt(position);
                TextView textView1 = (TextView) view.findViewById(R.id.list_name);
                String a = textView1.getText().toString();
                Log.d("A",a);
                Intent intent = new Intent(getActivity(), MasterEventActivity.class);
                Intent intent1 = new Intent(getActivity(),Doremipa.class);
                switch (position){
                    case 0:
                        intent1.putExtra("Chosen","Vrind");
                        startActivity(intent1);
                        break;
                    case 1:
                        intent.putExtra("Chosen","Spandan");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("Chosen","Nukkad");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("Chosen","Film-Maing KaleidoScope");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("Chosen","Art & Furious");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("Chosen","Kavyanjana");
                        startActivity(intent);
                        break;
                    case 6:
                        intent1.putExtra("Chosen","Engi-Idol");
                        startActivity(intent1);
                        break;
                    case 7:
                        intent.putExtra("Chosen","Creative Writing");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("Chosen","Paridhan");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("Chosen","Kavi Sammelan");
                        startActivity(intent);
                        break;
                    case 10:
                        intent1.putExtra("Chosen","Rock Night");
                        startActivity(intent1);
                        break;
                }
            }
        });

        return v;
    }

}
