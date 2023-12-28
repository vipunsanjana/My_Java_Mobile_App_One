package com.example.myappone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_total;
    private EditText et_fNumber;
    private EditText et_sNumber;
    private Button btn_add;

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

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fNumber = Float.parseFloat(et_fNumber.getText().toString());
                sNumber = Float.parseFloat(et_sNumber.getText().toString());

                total = fNumber + sNumber;
                total_string = String.valueOf(total);

                tv_total.setText(total_string);
            }
        });

    }
}