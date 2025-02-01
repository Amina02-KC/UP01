package com.example.homework_mobile_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView title1, res1;
    Button btn_1, btn_2;
    EditText et_a, et_b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_a = findViewById(R.id.a_et);
        et_b = findViewById(R.id.b_et);
        btn_1 = findViewById(R.id.calc_btn);
        btn_2 = findViewById(R.id.secondpage_btn);
        res1 = findViewById(R.id.res1_tv);
        }

        public void OnClick1(View v) {
            try {
                double a = Double.parseDouble(et_a.getText().toString());
                double b = Double.parseDouble(et_b.getText().toString());
                String res = "";
                for (int i = 0; i <= a; i++) {
                    res = res + i;
                }
                res1.setText("Результат: " + res);
            }
            catch (ArithmeticException e) {
                res1.setText("Ошибка");
            }
        }

        public void startSecondActivity(View view) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
}