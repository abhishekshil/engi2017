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
 * Use the {@link day3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class day3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ListView listView;

    String[] events = {"Two's A Show","Switch the funk up","War of Words","JAM(Just a Minute)","Natya",
            "3 Dimensional Art","Acoustic Alchemy","EDM Night- NUCLEYA"};
    String[] venue = {"Convo Hall","OAT","SPS Hall","SPS Hall","Auditorium","Edusat Hall","Wind Point","Sports Complex"};
    String[] time = {"10am","10am","10am - 5pm","10am - 5pm","10am","11am","2pm","7pm Onwards"};



    public day3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment day3.
     */
    // TODO: Rename and change types and number of parameters
    public static day3 newInstance(String param1, String param2) {
        day3 fragment = new day3();
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
        View v = inflater.inflate(R.layout.fragment_day3, container, false);


        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(),"fonts/OpenSans-Light.ttf");
        TextView textView = (TextView) v.findViewById(R.id.day_3);
        textView.setTypeface(tf);
        listView = (ListView) v.findViewById(R.id.list_view_3);
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
                        intent1.putExtra("Chosen","Two's A Show");
                        startActivity(intent1);
                        break;
                    case 1:
                        intent.putExtra("Chosen","Switch the funk up");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("Chosen","War of Words");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("Chosen","JAM(Just a Minute)");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("Chosen","Natya");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("Chosen","3 Dimensional Art");
                        startActivity(intent);
                        break;
                    case 6:
                        intent1.putExtra("Chosen","Acoustic Alchemy");
                        startActivity(intent1);
                        break;
                    case 7:
                        intent1.putExtra("Chosen","EDM Night-NUCLEYA");
                        startActivity(intent1);
                        break;
                }
            }
        });
        return v;
    }

}
