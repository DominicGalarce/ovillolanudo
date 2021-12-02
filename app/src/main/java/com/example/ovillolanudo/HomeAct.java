package com.example.ovillolanudo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeAct extends AppCompatActivity {
    VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        videoview = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=QVSoDMeMRy0");
        videoview.setMediaController(new MediaController(this));
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();

    }
    public void info(View view) {
        Intent i = new Intent(getBaseContext(), prueba2.class);
        startActivity(i);
    }
}