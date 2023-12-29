 package com.example.myappone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 public class SecondActivity extends AppCompatActivity {

     private Button btn_back;
     private float getTotal;
     private TextView tv_total_get;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_back = findViewById(R.id.btn_back);
        tv_total_get = findViewById(R.id.tv_total_get);

        getTotal = getIntent().getFloatExtra("total",0);
        tv_total_get.setText(String.valueOf(getTotal));

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentBack);
            }
        });

    }
}