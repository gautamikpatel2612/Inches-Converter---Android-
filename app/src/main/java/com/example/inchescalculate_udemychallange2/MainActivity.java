package com.example.inchescalculate_udemychallange2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private EditText editTextInches;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        findViewById();
        setOnClick();
    }

        private void findViewById() {
            editTextInches = findViewById(R.id.edit_text_inches);
            buttonCalculate = findViewById(R.id.button_calculate);
            textViewResult = findViewById(R.id.text_view_result);
        }

        private void setOnClick() {
            buttonCalculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inchesString = editTextInches.getText().toString();
                    if(inchesString.isEmpty()){
                        Toast.makeText(MainActivity.this, "Please input the value..", Toast.LENGTH_SHORT).show();
                    }else {
                        double result = calculateHeightInMeter(inchesString);
                        DecimalFormat myFormate = new DecimalFormat("0.00");
                        String stringResult = myFormate.format(result);
                        textViewResult.setText("Height : "+stringResult + "meter");
                    }
                }
            });
        }

        private double calculateHeightInMeter(String inchesString) {
            //String inchesString = editTextInches.getText().toString();
            int inches = Integer.parseInt(inchesString);
           // double result = inches * 0.0254;
            return inches * 0.0254;
        }
}