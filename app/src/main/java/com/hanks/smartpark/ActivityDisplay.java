package com.hanks.smartpark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }

    @Override

    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}


