package org.sddtu.engifest2017;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import me.anwarshahriar.calligrapher.Calligrapher;


public class MasterEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_master_event);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
        ImageView imageView;
        imageView = (ImageView)findViewById(R.id.image_master);
        textView1 = (TextView)findViewById(R.id.about_event);
        textView2= (TextView)findViewById(R.id.eventdate);
        textView3= (TextView)findViewById(R.id.eventtime);
        textView4= (TextView)findViewById(R.id.master_venue);
        //  textView5= (TextView)findViewById(R.id.eventlink);
        textView7 = (TextView)findViewById(R.id.rulesregul);
        textView6 = (TextView)findViewById(R.id.rules_event);
        textView8 = (TextView)findViewById(R.id.offlink);
        // Linkify.addLinks(textView5,Linkify.WEB_URLS);
        Button button = (Button)findViewById(R.id.regbutton);

        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Display display = getWindowManager().getDefaultDisplay();


        String s = getIntent().getStringExtra("Chosen");
        getSupportActionBar().setTitle(s);

        if(s.equals("Spandan")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
           // textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.SpandanRules);
        } else if(s.equals("StandUp Comedy")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.standup);
            textView1.setText(R.string.StandUp);
            textView2.setText("18 Feb'17");
            textView3.setText("5pm - 7pm");
            textView4.setText("Auditorium");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/Evwz4uxtIp0hxfxq1"));
                    startActivity(intent);
                }
            });
           // textView5.setText("https://goo.gl/forms/Evwz4uxtIp0hxfxq1");
            textView6.setText(R.string.StandUpRules);
        } else if(s.equals("Anushtaan")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.anushthaan);
            textView1.setText(R.string.Anusanthan);
            textView2.setText("18 Feb'17");
            textView3.setText("10am");
            textView7.setVisibility(View.GONE);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/3vyaN0YukfkJOVim1"));
                    startActivity(intent);
                }
            });
            textView4.setText("BR Ambedkar Auditorium)");
           // textView5.setText("https://goo.gl/forms/3vyaN0YukfkJOVim1");
            textView6.setVisibility(View.GONE);
            //textView6.setText(R.string);
        } else if(s.equals("Switch the funk up")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.STFU);
            textView2.setText("20 Feb'17");
            textView3.setText("10am");
            textView4.setText("OAT");
           // textView5.setText("https://docs.google.com/forms/d/e/1FAIpQLSev8bTXZFsaXf3MJvtp02buMZmwRLZ_EKiOV95d_FiWu3UofQ/viewform?c=0&w=1\n");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSev8bTXZFsaXf3MJvtp02buMZmwRLZ_EKiOV95d_FiWu3UofQ/viewform?c=0&w=1\\n"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.stfurules);
        }else if(s.equals("Nukkad")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.dramatics);
            textView1.setText(R.string.nukkad);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("MechC Parking(Prelims - 14th Feb)");
           // textView5.setText("https://goo.gl/forms/alPqX2f90B3C2TK62");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/alPqX2f90B3C2TK62"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.nukkadrules);
        }else if(s.equals("Natya")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.dramatics);
            textView1.setText(R.string.natya);
            textView2.setText("20 Feb'17");
            textView3.setText("10am");
            textView4.setText("Auditorium");
           // textView5.setText("https://goo.gl/forms/as6xlcC5uSjpCGg33");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/as6xlcC5uSjpCGg33"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.natyarules);
        }else if(s.equals("Paridhan")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.fashion);
            textView1.setText(R.string.paridhan);
            textView2.setText("19 Feb'17");
            textView3.setText("4pm");
            textView4.setText("Sports Complex");
           // textView5.setText("https://goo.gl/forms/dDkRYD4abwoWhwjf1");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/dDkRYD4abwoWhwjf1"));
                    startActivity(intent);
                }
            });
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
        }else if(s.equals("The Future of Fashion")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.fashion);
            textView1.setText(R.string.futureoffashion);
            textView2.setText("TBA");
            textView3.setText("TBA");
           // textView5.setText("https://goo.gl/forms/Uzpun8s0SRHVdPYK2");
            textView4.setText("");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/Uzpun8s0SRHVdPYK2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.futurefashionrules);
        }else if(s.equals("The Selfie Brag")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.fashion);
            textView1.setText(R.string.selfiebrag);
            textView2.setText("All 3 days");
            textView3.setText("All time");
            textView4.setText("");
           // textView5.setText("");
            textView8.setVisibility(View.GONE);
            button.setVisibility(View.GONE);
            textView6.setText(R.string.selfierules);
        }else if(s.equals("War of Words")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.WOW);
            textView2.setText("18 Feb'17");
            textView3.setText("10am - 5pm");
            textView4.setText("SPS Hall");
           // textView5.setText("https://goo.gl/forms/QEM9meb1nrfWxSCm1");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/QEM9meb1nrfWxSCm1"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.WOWrules);
        }else if(s.equals("Creative Writing")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.creative);
            textView2.setText("19 Feb'17");
            textView3.setText("3pm - 5pm");
            textView4.setText("SPS Hall");
           // textView5.setText("https://goo.gl/forms/jQ6clm4ZpgYAA5Rr2");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/jQ6clm4ZpgYAA5Rr2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.Creativerules);
        }else if(s.equals("Mixed Bag")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.mixedbag);
            textView2.setText("20 Feb'17");
            textView3.setText("2pm - 4pm");
            textView4.setText("SPS Hall");
           // textView5.setText("https://goo.gl/forms/xt7I0CYeghtEvtRV2");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/xt7I0CYeghtEvtRV2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.mixedbagrules);
        }else if(s.equals("Kavyanjana")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.Hindilit);
            textView2.setText("20 Feb'17");
            textView3.setText("11am - 1pm");
            textView4.setText("SPS Hall");
           // textView5.setText("https://goo.gl/forms/vro4gBaxSv4RBfKC2");
            textView6.setVisibility(View.GONE);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/vro4gBaxSv4RBfKC2"));
                    startActivity(intent);
                }
            });
            textView7.setVisibility(View.GONE);
        }else if(s.equals("JAM(Just a Minute)")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.jam);
            textView2.setText("19 Feb'17");
            textView3.setText("10am - 5pm");
            textView4.setText("SPS Hall");
           // textView5.setText("https://goo.gl/forms/C4FvoMOHZrN2KFre2");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/C4FvoMOHZrN2KFre2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.jamrules);
        }else if(s.equals("DrishtiKon")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.hindilit2);
            textView2.setText("18 Feb'17");
            textView3.setText("10am - 2pm");
            textView4.setText("");
           // textView5.setText("https://goo.gl/forms/pJdnF23No4IcBHRl1");
            textView6.setVisibility(View.GONE);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/pJdnF23No4IcBHRl1"));
                    startActivity(intent);
                }
            });
            textView7.setVisibility(View.GONE);
        }else if(s.equals("Film-Making Kaleidoscope")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.engievents);
            textView1.setText(R.string.film_Making);
            textView2.setText("19 Feb'17");
            textView3.setText("10am onwards");
            textView4.setText("SPS 13");
           // textView5.setText("https://goo.gl/S7umWT");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/S7umWT"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.filmmakingrules);
        }else if(s.equals("ShakeDown")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.engif);
            textView1.setText(R.string.shakedown);
            textView2.setText("18 Feb'17");
            textView3.setText("12pm");
            textView4.setText("Hostel Road");
           // textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            button.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
        }else if(s.equals("Arte Fotographia")) {
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.eng);
            textView1.setText("Event description: Arte fotographia is the official Online photography competition of engifest conducted by parchhayi, the photography and film making society of DTU.\n");
            textView2.setText("TBA");
            textView3.setText("TBA");
            textView4.setText("");
            textView6.setText("");
            textView7.setVisibility(View.GONE);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/1W47bp"));
                    startActivity(intent);
                }
            });
            // textView5.setText("https://goo.gl/1W47bp");
        } else if(s.equals("Kavi Sammelan")) {
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.kavisammelan);
            textView2.setText("20 Feb'17");
            textView3.setText("4pm");
            textView4.setText("OAT");
           // textView5.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            button.setVisibility(View.GONE);
        } else if(s.equals("Shoe painting")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.shoepainting);
            textView2.setText("18 Feb'17");
            textView3.setText("10am");
            textView4.setText("EduSat Hall");
           // textView5.setText("https://goo.gl/aKT2Rk");
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/aKT2Rk"));
                    startActivity(intent);
                }
            });
        }else if(s.equals("Art & Furious")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.Artfurious);
            textView2.setText("19 Feb'17");
            textView3.setText("11am");
            textView4.setText("EduSat Hall");
           // textView5.setText("https://goo.gl/eaa6As");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/eaa6As"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.artfuriousrules);
        }else if(s.equals("3 Dimensional Art")){
            layoutParams.height = (int) (display.getHeight()*0.2);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.threedart);
            textView2.setText("20 Feb'17");
            textView3.setText("11am");
            textView4.setText("EduSat Hall");
           // textView5.setText("https://goo.gl/5xLdsN");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/5xLdsN"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.threedartrules);
        }
    }
}
