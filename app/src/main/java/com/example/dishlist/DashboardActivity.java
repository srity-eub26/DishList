// DashboardActivity.java
package com.example.dishlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class DashboardActivity extends AppCompatActivity {

    private Button profileButton;
    private Button settingsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        profileButton = findViewById(R.id.profileButton);
        settingsButton = findViewById(R.id.settingsButton);


        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to navigate to Profile screen
                Toast.makeText(DashboardActivity.this, "Profile Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to navigate to Settings screen
                Toast.makeText(DashboardActivity.this, "Settings Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
