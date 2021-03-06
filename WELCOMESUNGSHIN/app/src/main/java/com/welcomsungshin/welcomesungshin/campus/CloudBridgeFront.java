package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class CloudBridgeFront extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_bridge_front);
        getWindow().setWindowAnimations(0);
    }
    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToEmakkwan(View v) {
        Intent intent = new Intent(this, Emakkwan.class);
        startActivity(intent);
        finish();
    }

    public void clickedToJohyungkwan(View v) {
        Intent intent = new Intent(this, Johyungkwan.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSungshin03Ele(View v) {
        Intent intent = new Intent(this, Sungshin03Ele.class);
        startActivity(intent);
        finish();
    }

    public void clickedToNan07CloudBridge(View v) {
        Intent intent = new Intent(this, Nan07CloudBridge.class);
        startActivity(intent);
        finish();
    }
}
