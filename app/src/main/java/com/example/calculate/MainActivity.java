package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int first, second;
    private Boolean isOperationClick;
    private String operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        makeTransparentStatusBar();
    }

    private void makeTransparentStatusBar() {
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    public void numberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_three:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                operator = "+";
                break;
            case R.id.btn_minus:
                first = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                operator = "-";
                break;
            case R.id.btn_multiply:
                first = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                operator = "*";
                break;
            case R.id.btn_divide:
                first = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                operator = "/";
                break;
            case R.id.btn_equal:
                switch (operator) {
                    case "+": {
                        second = Integer.parseInt(textView.getText().toString());
                        textView.setText(Integer.toString(first + second));
                        break;
                    }
                    case "-": {
                        second = Integer.parseInt(textView.getText().toString());
                        textView.setText(Integer.toString(first - second));
                        break;
                    }
                    case "*": {
                        second = Integer.parseInt(textView.getText().toString());
                        textView.setText(Integer.toString(first * second));
                        break;
                    }
                    case "/": {
                        second = Integer.parseInt(textView.getText().toString());
                        textView.setText(Integer.toString(first / second));
                        break;
                    }
                }
                isOperationClick = true;
        }
    }
}