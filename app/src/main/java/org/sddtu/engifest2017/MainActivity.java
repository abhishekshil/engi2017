package org.sddtu.engifest2017;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("");

        videoView = (VideoView) findViewById(R.id.video1);

        String uripath = "android.resource://" + getPackageName() + "/" + R.raw.engisplash;
        Uri uri = Uri.parse(uripath);

        videoView.setVideoURI(uri);

        videoView.start();
        videoView.requestFocus();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                finish();
                startActivity(new Intent(MainActivity.this,HomeActivity.class));
            }
        });


    }
}
