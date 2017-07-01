package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.color_red,"red","weṭeṭṭi",R.raw.color_red));
        words.add(new Word(R.drawable.color_green,"green","chokokki",R.raw.color_green));
        words.add(new Word(R.drawable.color_brown,"brown","ṭakaakki",R.raw.color_brown));
        words.add(new Word(R.drawable.color_gray,"gray","ṭopoppi",R.raw.color_gray));
        words.add(new Word(R.drawable.color_black,"black","kululli",R.raw.color_black));
        words.add(new Word(R.drawable.color_white,"white","kelelli",R.raw.color_white));
        words.add(new Word(R.drawable.color_dusty_yellow,"dusty yellow","ṭopiisə",R.raw.color_dusty_yellow));
        words.add(new Word(R.drawable.color_mustard_yellow,"mustard yellow","chiwiiṭə",R.raw.color_mustard_yellow));

        final WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,long id)
            {
                //final Word currentWord = adapter.getItem(position);
                Word currentWord = words.get(position);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, currentWord.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
