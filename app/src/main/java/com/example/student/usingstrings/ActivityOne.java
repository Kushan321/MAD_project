package com.example.student.usingstrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        tv2 = findViewById(R.id.txtV2);
        tv2.setText(R.string.msg1);

        Log.i("Lifecycle", "Inside on create method");
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        Log.i("Lifecycle", "Inside on resume method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle", "Inside on Restart method");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "Inside on pause method");

    }
}
