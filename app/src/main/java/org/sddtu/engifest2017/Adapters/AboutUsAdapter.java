package org.sddtu.engifest2017.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.sddtu.engifest2017.AboutUs;
import org.sddtu.engifest2017.DataProviders.AboutUsData;
import org.sddtu.engifest2017.R;

import java.util.ArrayList;

/**
 * Created by mohitkumar on 08/01/17.
 */

public class AboutUsAdapter extends RecyclerView.Adapter<AboutUsAdapter.RecyclerViewHolder> {

    Context context;
    ArrayList<AboutUsData> arrayList = new ArrayList<AboutUsData>();

    public AboutUsAdapter(Context context,ArrayList<AboutUsData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.about_us_card,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,context,arrayList);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        AboutUsData aboutUsData = arrayList.get(position);

        Typeface tf = Typeface.createFromAsset(context.getAssets(),"fonts/OpenSans-Regular.ttf");

        holder.textView1.setTypeface(tf);
        holder.textView2.setTypeface(tf);
        holder.textView3.setTypeface(tf);

        holder.textView1.setText(aboutUsData.getName());
        holder.textView2.setText(aboutUsData.getDesignation());
        holder.textView3.setText(aboutUsData.getMobile());
        holder.imageView.setImageResource(aboutUsData.getImgsrc());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textView1,textView2,textView3;
        ImageView imageView;
        Context context;
        ArrayList<AboutUsData> arrayList = new ArrayList<AboutUsData>();
        public RecyclerViewHolder(View itemView,Context context,ArrayList<AboutUsData> arrayList) {
            super(itemView);
            this.context = context;
            this.arrayList = arrayList;
            textView1 = (TextView) itemView.findViewById(R.id.about_card_name);
            textView2 = (TextView) itemView.findViewById(R.id.desig_about_card);
            textView3 = (TextView) itemView.findViewById(R.id.about_card_mob);
            imageView = (ImageView)itemView.findViewById(R.id.img);
        }
    }
}
