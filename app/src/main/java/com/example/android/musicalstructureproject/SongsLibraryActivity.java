package com.example.android.musicalstructureproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongsLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_library);
        Button button_main_screen = (Button) findViewById(R.id.button_main_screen);
        Button button_songs_library = (Button) findViewById(R.id.button_songs_library);
        Button button_search_music = (Button) findViewById(R.id.button_search_music);
        Button button_settings = (Button) findViewById(R.id.button_settings);

        button_main_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SongsLibraryActivity.this, MainActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        button_search_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchMusicIntent = new Intent(SongsLibraryActivity.this, SearchMusicActivity.class);
                startActivity(searchMusicIntent);
            }
        });

        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(SongsLibraryActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });
    }
}