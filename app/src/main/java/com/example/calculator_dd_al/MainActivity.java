package com.example.calculator_dd_al;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText et_1, et_2;
    TextView txt_result;
    Button btn_plus, btn_minus, btn_mullt, btn_divide, btn_clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_1 = findViewById(R.id.et_1);
        et_2 = findViewById(R.id.et_2);
        txt_result = findViewById(R.id.txt_result);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_mullt = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_clear = findViewById(R.id.btn_clear);
        onClick();
    }
    public int getIntFromEditText(EditText editText) {
        if (editText.getText().toString().equals(" ")) {
            Toast.makeText(this, "Введите числа", Toast.LENGTH_SHORT).show();
            return 0;
        } else {
            return Integer.parseInt(editText.getText().toString());
        }
    }

    private void onClick() {

        btn_plus.setOnClickListener(v1 -> {
            Log.e("TAG","сработал плюс!");

            try {
                int a1 = getIntFromEditText(et_1);
                int b1 = getIntFromEditText(et_2);
                int c = a1 + b1;
                txt_result.setText(String.valueOf(c));

            } catch (NumberFormatException ex) {

                Toast.makeText(this, "Введите числа!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_minus.setOnClickListener(v2 -> {
            Log.e("TAG", "УРА, Сработал минус!!");
            try {

                int a2 = getIntFromEditText(et_1);
                int b2 = getIntFromEditText(et_2);
                int c = a2 - b2;
                txt_result.setText(String.valueOf(c));

            } catch (NumberFormatException ex) {
                Toast.makeText(this, "Заполните поля !!!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_mullt.setOnClickListener(v3 -> {
            Log.e("TAG", "Сработало умножение ! !!");
            try {
                int a3 = getIntFromEditText(et_1);
                int b3 = getIntFromEditText(et_2);
                int c = a3 * b3;
                txt_result.setText(String.valueOf(c));
            } catch (NumberFormatException ex) {
                Toast.makeText(this, "Заполните поля !!!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_divide.setOnClickListener(v4 -> {
            Log.e("TAG", "Сработало деление ! !!");
            try {
                int a4 = getIntFromEditText(et_1);
                int b4 = getIntFromEditText(et_2);
                double result = (double) (a4 / b4);
                txt_result.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {

                Toast.makeText(this, "Заполните поля !!!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_clear.setOnClickListener(v5 -> {
            et_1.setText("");
            et_2.setText("");
            txt_result.setText("");
        });
    }


}

