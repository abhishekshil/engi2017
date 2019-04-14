package org.sddtu.engifest2017;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import me.anwarshahriar.calligrapher.Calligrapher;

public class EngiActivity extends AppCompatActivity {


    TextView textView1,textView2;
    FloatingActionButton navigate;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_engi);

        imageView = (ImageView) findViewById(R.id.engi_poster);

        getSupportActionBar().setTitle("About Engifest Infinity");
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);
//
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//       Display display =  getWindowManager().getDefaultDisplay();
//        int height = display.getHeight();
//        int width  = display.getWidth();
//
//        int h = (int) (height*0.317);
//
        //int width = displayMetrics.widthPixels;
//        final float scale = getResources().getDisplayMetrics().density;
//        int dpWidthInPx  = (int) (720 * scale);
//        int dpHeightInPx = (int) (204 * scale);
//        imageView.setLayoutParams(parms);

//        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(dpWidthInPx,dpHeightInPx);
//        imageView.setLayoutParams(parms);

        final ViewTreeObserver mLayoutObserver = imageView.getViewTreeObserver();

        mLayoutObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
        {

            @Override
            public void onGlobalLayout()
            {
                DisplayMetrics metrics = getResources().getDisplayMetrics();

                int deviceWidth = metrics.widthPixels;

                int deviceHeight = metrics.heightPixels;

                float widthInPercentage =  ((float)1) * 100;

                float heightInPercentage =  ((float)430.5/1280)*100;

                int mLayoutWidth = (int) ( (widthInPercentage * deviceWidth) / 100 );

                int mLayoutHeight = (int) ( (heightInPercentage * deviceHeight) / 100 );

                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(mLayoutWidth, mLayoutHeight);

                imageView.setLayoutParams(layoutParams);
            }
        });


//        Toast.makeText(getApplicationContext(),height + " ",Toast.LENGTH_LONG).show();

//        textView1 = (TextView) findViewById(R.id.web_url);
        navigate = (FloatingActionButton) findViewById(R.id.nav_button);
//        Linkify.addLinks(textView1,Linkify.WEB_URLS);
//        textView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH,"geo:0,0?q="+"Delhi Technological University,Delhi-110042,India");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });


    }
}
