package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class NanToSungshin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nan_to_sungshin);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }


    public void clickedToNanPark(View v) {
        Intent intent = new Intent(this, NanPark.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSungshin(View v) {
        Intent intent = new Intent(this, Sungshinkwan.class);
        startActivity(intent);
        finish();
    }
}
