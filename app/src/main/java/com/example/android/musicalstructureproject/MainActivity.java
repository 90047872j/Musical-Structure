package com.example.android.musicalstructureproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nowPlayingButton = (Button) findViewById(R.id.nowPlayingButton);
        Button songsLibraryButton = (Button) findViewById(R.id.songsLibraryButton);
        Button searchMusicButton = (Button) findViewById(R.id.searchMusicButton);

        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        songsLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsLibraryIntent = new Intent(MainActivity.this, SongsLibraryActivity.class);
                startActivity(songsLibraryIntent);
            }
        });

        searchMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchMusicIntent = new Intent(MainActivity.this, SearchMusicActivity.class);
                startActivity(searchMusicIntent);
            }
        });
    }
}
