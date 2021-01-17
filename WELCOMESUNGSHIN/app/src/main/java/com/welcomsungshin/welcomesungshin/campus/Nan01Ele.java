package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Nan01Ele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nan01_ele);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToNan03Ele(View v) {
        Intent intent = new Intent(this, Nan03Ele.class);
        startActivity(intent);
        finish();
    }

    public void clickedToNanhyangkwan(View v) {
        Intent intent = new Intent(this, Nanhyangkwan.class);
        startActivity(intent);
        finish();
    }
}
