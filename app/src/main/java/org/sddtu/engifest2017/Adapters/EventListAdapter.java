package org.sddtu.engifest2017.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.sddtu.engifest2017.DataProviders.EventProvider;
import org.sddtu.engifest2017.DataProviders.ListViewData;
import org.sddtu.engifest2017.EventList;
import org.sddtu.engifest2017.R;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohitkumar on 15/01/17.
 */

public class EventListAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public EventListAdapter(Context context, int resource) {
        super(context,resource);
    }

    static class Data {
        TextView eventname;
        TextView venue;
        TextView time;
        TextView date;
    }


    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = convertView;
        EventListAdapter.Data d;
        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.cutom_alert_list,parent,false);
            d = new EventListAdapter.Data();
            d.eventname = (TextView)view.findViewById(R.id.list_event);
            d.venue = (TextView)view.findViewById(R.id.venue);
            d.time = (TextView)view.findViewById(R.id.time1);
            d.date = (TextView)view.findViewById(R.id.daydate) ;
            view.setTag(d);
        }
        else  {
            d = (EventListAdapter.Data)view.getTag();
        }
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"fonts/OpenSans-Light.ttf");
        Typeface tff = Typeface.createFromAsset(getContext().getAssets(),"fonts/OpenSans-Regular.ttf");

        d.eventname.setTypeface(tf);
        d.time.setTypeface(tff);
        d.venue.setTypeface(tff);
        d.date.setTypeface(tff);
        EventProvider listViewData = (EventProvider) this.getItem(position);
        d.eventname.setText(listViewData.getEvent());
        d.venue.setText(listViewData.getVenue());
        d.time.setText(listViewData.getTime());
        d.date.setText(listViewData.getDate());
        return view;
    }
}
