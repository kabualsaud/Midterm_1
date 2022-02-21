package com.example.khalidabualsaud_midterm_12022;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgCat;
    MediaPlayer mpMeow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mpMeow = MediaPlayer.create(this,R.raw.catmeow);
        imgCat = (ImageView) findViewById(R.id.imgCat);
    }
    View.OnClickListener btCat = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mpMeow.start();
        }
     };
}
