package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page85 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page85);
    }
    public void launch89(View v) {
        Intent intent = new Intent(this, page89.class);
        startActivity(intent);
        finish();
    }
    public void launch90(View v) {
        Intent intent = new Intent(this, page90.class);
        startActivity(intent);
        finish();
    }
}
