package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.number_one,"one","lutti"));
        words.add(new Word(R.drawable.number_two,"two","otiiko"));
        words.add(new Word(R.drawable.number_three,"three","tolookosu"));
        words.add(new Word(R.drawable.number_four,"four","oyyisa"));
        words.add(new Word(R.drawable.number_five,"five","massokka"));
        words.add(new Word(R.drawable.number_six,"six","temmokka"));
        words.add(new Word(R.drawable.number_seven,"seven","kenekaku"));
        words.add(new Word(R.drawable.number_eight,"eight","kawinta"));
        words.add(new Word(R.drawable.number_nine,"nine","wo'e"));
        words.add(new Word(R.drawable.number_ten,"ten","na'aacha"));


//        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(1));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(2));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(3));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(4));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(5));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(6));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(7));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(8));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(9));

//        for(int i=0;i<words.size();i++) {
//            LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        //GridView gridView = (GridView) findViewById(R.id.list);
        //gridView.setAdapter(itemsAdapter);


    }
}
