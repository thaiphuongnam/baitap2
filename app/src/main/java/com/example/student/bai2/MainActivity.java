package com.example.student.bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextFahrenheit, editTextCelsius;
    Button buttonC2F, buttonF2C, buttonClear;
    int c = 0;
    int f = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }
    private void addEvents() {
        buttonC2F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    c = Integer.parseInt(editTextCelsius.getText().toString());
                } catch (Exception ex) {
                    c = 0;
                }
                int result = Calculator.celsiusToFahrenheit(c);
                editTextFahrenheit.setText(String.valueOf(result));
            }
        });
        buttonF2C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    f = Integer.parseInt(editTextFahrenheit.getText().toString());
                } catch (Exception ex) {
                    f = 0;
                }
                int result = Calculator.fahrenheitToCelsius(f);
                editTextCelsius.setText(String.valueOf(result));
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextCelsius.setText("");
                editTextFahrenheit.setText("");
            }
        });
    }

    private void addControls() {
        editTextCelsius = findViewById(R.id.editTextCelsius);
        editTextFahrenheit = findViewById(R.id.editTextFahrenheit);
        buttonC2F = findViewById(R.id.buttonC2F);
        buttonF2C = findViewById(R.id.buttonF2C);
        buttonClear = findViewById(R.id.buttonClear);
    }
}
