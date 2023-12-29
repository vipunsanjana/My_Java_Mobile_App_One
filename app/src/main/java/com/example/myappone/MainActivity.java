package com.example.myappone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private TextView tv_total;
    private EditText et_fNumber;
    private EditText et_sNumber;
    private Button btn_add;
    private Button btn_next;
    private ConstraintLayout cons_main;

    private float fNumber;
    private float sNumber;
    private float total;
    private String total_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_total = findViewById(R.id.tv_total);
        et_fNumber = findViewById(R.id.et_fNumber);
        et_sNumber = findViewById(R.id.et_sNumber);
        btn_add = findViewById(R.id.btn_add);
        btn_next = findViewById(R.id.btn_next);
        cons_main = findViewById(R.id.cons_main);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fNumber = Float.parseFloat(et_fNumber.getText().toString());
                sNumber = Float.parseFloat(et_sNumber.getText().toString());

                total = fNumber + sNumber;
                total_string = String.valueOf(total);

                Toast.makeText(getApplicationContext(), total_string+" Added . ", Toast.LENGTH_LONG).show();
                Snackbar snackbar = Snackbar.make(cons_main, "Total :"+total_string, Snackbar.LENGTH_LONG);
                snackbar.show();

                tv_total.setText(total_string);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNext = new Intent(getApplicationContext(), SecondActivity.class);
                intentNext.putExtra("total", total);
                startActivity(intentNext);
            }
        });

    }
}