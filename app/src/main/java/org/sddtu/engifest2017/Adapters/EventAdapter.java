package org.sddtu.engifest2017.Adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.sddtu.engifest2017.BeforeMaster;
import org.sddtu.engifest2017.DataProviders.EventData;
import org.sddtu.engifest2017.MasterEventActivity;
import org.sddtu.engifest2017.R;

import java.util.ArrayList;


public class EventAdapter extends RecyclerView.Adapter<EventAdapter.RecyclerViewHolder> {

    Context context;
    ArrayList<EventData> arrayList = new ArrayList<EventData>();

    public EventAdapter(Context context,ArrayList<EventData> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.event_card_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,context,arrayList);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        EventData eventData = arrayList.get(position);

        Typeface tf = Typeface.createFromAsset(context.getAssets(),"fonts/RobotoCondensed-Regular.ttf");

        holder.textView1.setTypeface(tf);

        holder.textView1.setText(eventData.getName());
        holder.imageView.setImageResource(eventData.getImage());
        holder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        CharSequence[] chars = {"Spandan", "Anushthaan", "Switch the funk up"};

        TextView textView1;
        ImageView imageView;
        Context context;
        ArrayList<EventData> arrayList = new ArrayList<EventData>();
        public RecyclerViewHolder(View itemView,Context context,ArrayList<EventData> arrayList) {
            super(itemView);
            this.context = context;
            this.arrayList = arrayList;
            textView1 = (TextView)itemView.findViewById(R.id.event_name);
            imageView = (ImageView)itemView.findViewById(R.id.image_event);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            String s = textView1.getText().toString();
            Intent intent = new Intent(context, BeforeMaster.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            if(s.equals("Dance")) {
                intent.putExtra("Choose","Dance");
                context.startActivity(intent);
            } else if(s.equals("Music")) {
                intent.putExtra("Choose","Music");
                context.startActivity(intent);

            } else if(s.equals("Literary")) {
                intent.putExtra("Choose","Literary");
                context.startActivity(intent);

            } else if(s.equals("Pro Night")) {
                intent.putExtra("Choose","Pro Night");
                context.startActivity(intent);

            } else if(s.equals("Drama")) {
                intent.putExtra("Choose","Drama");
                context.startActivity(intent);

            } else if(s.equals("Fashion")) {
                intent.putExtra("Choose","Fashion");
                context.startActivity(intent);

            } else if(s.equals("Informal Events")) {
                intent.putExtra("Choose","Informal");
                context.startActivity(intent);

            } else if(s.equals("Miscellaneous")) {
                intent.putExtra("Choose","Miscellaneous");
                context.startActivity(intent);
            } else if(s.equals("Art(SpectRang)")) {
                intent.putExtra("Choose","Art(SpectRang)");
                context.startActivity(intent);
            }
        }
    }
}
