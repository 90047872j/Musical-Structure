package com.example.android.musicalstructureproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button button_main_screen = (Button) findViewById(R.id.button_main_screen);
        Button button_songs_library = (Button) findViewById(R.id.button_songs_library);
        Button button_search_music = (Button) findViewById(R.id.button_search_music);
        Button button_settings = (Button) findViewById(R.id.button_settings);

        button_main_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        button_songs_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsLibraryIntent = new Intent(SettingsActivity.this, SongsLibraryActivity.class);
                startActivity(songsLibraryIntent);
            }
        });

        button_search_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchMusicIntent = new Intent(SettingsActivity.this, SearchMusicActivity.class);
                startActivity(searchMusicIntent);
            }
        });
    }
}