package com.welcomsungshin.welcomesungshin.campus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.welcomsungshin.welcomesungshin.R;

public class Hakkwan extends AppCompatActivity {
    public static Activity Hakkwan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkwan);
        getWindow().setWindowAnimations(0);

        Hakkwan = Hakkwan.this;
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToHakkwan01Ele(View v) {
        Intent intent = new Intent(this, Hakkwan01Ele.class);
        startActivity(intent);
        finish();
    }
}
