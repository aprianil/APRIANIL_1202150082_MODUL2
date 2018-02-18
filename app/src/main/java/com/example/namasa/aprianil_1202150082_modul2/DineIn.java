package com.example.namasa.aprianil_1202150082_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.LinkedList;

public class DineIn extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        for (int i = 0; i < 20; i++) {
            mWordList.addLast("Word " + mCount++);
            Log.d("WordList", mWordList.getLast());
        }
    }
}
