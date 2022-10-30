package com.example.calculate;

import static com.example.calculate.R.id.text_2_View;
import static com.example.calculate.R.id.text_view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;
    Button btnClear2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=(TextView) findViewById(text_2_View);
        btnClear2=findViewById(R.id.btn_2_clear);

        Intent intent = getIntent();
        String name= intent.getStringExtra("2002");
        textView2.setText(name);

        btnClear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onDestroy();
            }
        });
    }
}