package org.sddtu.engifest2017;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class RegisterActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_register);

        getSupportActionBar().setTitle("Registration");
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        textView = (TextView) findViewById(R.id.steps);
        textView.setText(R.string.register);
        Button button = (Button) findViewById(R.id.click_here);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.pokerbaazi.com/pbuser?campaigncode=ENGIFEST");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}