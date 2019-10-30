package com.example.projectd;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class NewsMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {//固有
        super.onCreate(savedInstanceState);//固有
        setContentView(R.layout.mews_activity_main);//固有
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);

    }
}
