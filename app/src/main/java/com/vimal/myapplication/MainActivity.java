package com.vimal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle b = getIntent().getExtras();
        if (b != null) {
            String order_id = b.getString("order_id");
            Log.d("vml", order_id + "  order_id");
            if (TextUtils.isEmpty(order_id)) {
                String reward = b.getString("reward");
                Log.d("vml", reward + "  reward");
                if (TextUtils.isEmpty(reward)) {
                    //Load Your Default Activity
                } else {
                    startActivity(new Intent(this, MainActivity2.class));
                }

            } else {
                //Load Your Default Activity
            }

        }


        findViewById(R.id.crash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                throw new RuntimeException("Test Crash"); // Force a crash
            }
        });
    }
}