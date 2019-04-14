package org.sddtu.engifest2017;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class Doremipa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doremipa);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
        ImageView imageView;
        imageView = (ImageView)findViewById(R.id.image_dore);
        textView1 = (TextView)findViewById(R.id.about_event);
        textView2= (TextView)findViewById(R.id.eventdate);
        textView3= (TextView)findViewById(R.id.eventtime);
        textView4= (TextView)findViewById(R.id.master_venue);
        textView7 = (TextView)findViewById(R.id.rulesregul);
        textView6 = (TextView)findViewById(R.id.rules_event);
        textView8 = (TextView)findViewById(R.id.offlink);
        Button button = (Button)findViewById(R.id.regbutton);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Display display = getWindowManager().getDefaultDisplay();

        String s = getIntent().getStringExtra("Chosen");
        getSupportActionBar().setTitle(s);

        if(s.equals("Engi-Idol")){
            layoutParams.height = (int) (display.getHeight()*0.42);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.doremipa);
            textView1.setText(R.string.EngiIdol);
            textView2.setText("19 Feb'17");
            textView3.setText("2pm");
            textView4.setText("Convo Hall");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/wOkab01SW0mKD0pb2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.engiidolrules);
        } else if(s.equals("Vocalicious")){
            layoutParams.height = (int) (display.getHeight()*0.42);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.doremipa);
            textView1.setText(R.string.Vocalicious);
            textView2.setText("18 Feb'17");
            textView3.setText("2pm");
            textView4.setText("Convo Hall");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/HQl47owDBb2P3VqS2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.vocaliciousrules);
        }else if(s.equals("BallaDeers")){
            layoutParams.height = (int) (display.getHeight()*0.42);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.doremipa);
            textView1.setText(R.string.Balladeers);
            textView2.setText("18 Feb'17");
            textView3.setText("9am");
            textView4.setText("Convo Hall");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/Y1FV6mG1HIohE5Si2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.Balladeersrules);
        }else if(s.equals("Vrind")){
            layoutParams.height = (int) (display.getHeight()*0.42);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.doremipa);
            textView1.setText(R.string.Vrind);
            textView2.setText("19 Feb'17");
            textView3.setText("9am");
            textView4.setText("Convo Hall");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/24wp6CcgVbFikP9E3"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.Vrindrules);
        }else if(s.equals("Two's A Show")){
            layoutParams.height = (int) (display.getHeight()*0.42);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.doremipa);
            textView1.setText(R.string.twoAShow);
            textView2.setText("20 Feb'17");
            textView3.setText("10am");
            textView4.setText("Convo Hall");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/edJPZQ8Dvw7UDyNw1"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.twoashowrules);
        }else if(s.equals("Acoustic Alchemy")){
            layoutParams.height = (int) (display.getHeight()*0.42);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.doremipa);
            textView1.setText(R.string.Acoustic);
            textView2.setText("20 Feb'17");
            textView3.setText("2pm");
            textView4.setText("Wind Point");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/bjCM89DelW9WGYfZ2"));
                    startActivity(intent);
                }
            });
            textView6.setText(R.string.acousticrules);
        }else if(s.equals("EDM Night-NUCLEYA")){
            layoutParams.height = (int) (display.getHeight()*0.55);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.nucleya);
            textView1.setText("Adhbudh. Anokha. Aelaan.\n" +
                    "\n" +
                    "Akkad Bakkad Bambe Bo.\n" +
                    "Engi main dekho aa gaya woh.\n" +
                    "Aaja thoda Chennai Bass bajva de.\n" +
                    "Bass Rani ke saath Raja Baja bhi bulva de.\n" +
                    "Aao Engifest ka Scene Set Karwa De!\n" +
                    "\n" +
                    "Engifest 2017 and Pokerbaazi.com present to you one of the most exciting, experimental and engaging electronic music producers in the Indian Scene – NUCLEYA! \n" +
                    "\n" +
                    "This 20th February, get ready to groove, get ready to headbang at Engifest, DTU. GET READY TO EXPERIENCE THE INFINITE!\n" +
                    "\n" +
                    "We are thankful to 7Entertainment for all the help and artist co-ordination.\n" +
                    "\n" +
                    "#EngifestInfinity #AaGayaWoh");
            textView2.setText("20th February");
            textView3.setText("7 PM");
            textView4.setText("Sports Complex");
            textView7.setVisibility(View.GONE);
            button.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
        }else if(s.equals("Live Wire")){
            layoutParams.height = (int) (display.getHeight()*0.53);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.sunidhi);
            textView1.setText("Sunidhi Chauhan is there to enrich your night with their presence. All gonna rock n roll their bodies and join them with zest and enthusiam. So put your hands up and welcome engi'17!");
            textView2.setText("18th February");
            textView3.setText("7 PM");
            textView4.setText("Sports Complex");
            textView7.setVisibility(View.GONE);
            button.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
        }else if(s.equals("Rock Night")){
            layoutParams.height = (int) (display.getHeight()*0.47);
            layoutParams.width = display.getWidth();
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.lagori);
            textView1.setText("“Rock and roll is a nuclear blast of reality in a mundane world where no-one is allowed to be magnificent.” -Kim Fowley \n" +
                    "Engifest’17 brings you Lagori for a sonically exhilarating experience that will leave your senses absolutely spellbound! You won’t be able to resist banging your heads to the powerful beats and tapping your feet with the intense music; so overwhelmingly influencing will be the aura at this event! \n");
            textView2.setText("19th February");
            textView3.setText("7 PM");
            textView4.setText("Sports Complex");
            button.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
        }
    }
}
