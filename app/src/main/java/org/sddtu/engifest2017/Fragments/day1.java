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
import org.sddtu.engifest2017.BeforeMaster;
import org.sddtu.engifest2017.DataProviders.ListViewData;
import org.sddtu.engifest2017.Doremipa;
import org.sddtu.engifest2017.MasterEventActivity;
import org.sddtu.engifest2017.R;

import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link day1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class day1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    ListView listView;
    String[] events = {"BallaDeers","Shoe painting","Anushtaan","DrishtiKon","ShakeDown","Vocalicious"
            ,"Mixed Bag","StandUp Comedy","Live Wire"};
    String[] venue = {"Convo Hall","EduSat Hall","Auditorium","SPS Hall","Hostel Road","Convo Hall","SPS Hall"
            ,"Auditorium","Sports Complex"};
    String[] time = {"9am","10am","10am","10am - 2pm","12pm","2pm","2pm - 4pm","5pm - 7pm","7pm onwards"};

    public day1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment day1.
     */
    // TODO: Rename and change types and number of parameters
    public static day1 newInstance(String param1, String param2) {
        day1 fragment = new day1();
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
        View v =  inflater.inflate(R.layout.fragment_day1, container, false);

        // Inflate the layout for this fragment
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(),"fonts/OpenSans-Light.ttf");

        TextView textView = (TextView) v.findViewById(R.id.day_1);
        textView.setTypeface(tf);
        listView = (ListView) v.findViewById(R.id.list_view);
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
                        intent1.putExtra("Chosen","BallaDeers");
                        startActivity(intent1);
                        break;
                    case 1:
                        intent.putExtra("Chosen","Shoe Painting");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("Chosen","Anushtaan");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("Chosen","DrishtiKon");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("Chosen","ShakeDown");
                        startActivity(intent);
                        break;
                    case 5:
                        intent1.putExtra("Chosen","Vocalicious");
                        startActivity(intent1);
                        break;
                    case 6:
                        intent.putExtra("Chosen","Mixed Bag");
                        break;
                    case 7:
                        intent.putExtra("Chosen","StandUp Comedy");
                        startActivity(intent);
                        break;
                    case 8:
                        intent1.putExtra("Chosen","Live Wire");
                        startActivity(intent1);
                        break;
                }
            }
        });

        return v;

    }

}
