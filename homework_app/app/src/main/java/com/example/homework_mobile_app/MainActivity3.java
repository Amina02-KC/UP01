package com.example.homework_mobile_app;

import static java.lang.Math.*;

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

public class MainActivity3 extends AppCompatActivity {
    TextView title3, res3;
    Button btn_5, btn_6;
    EditText et_a3, et_x, et_y, et_m, et_n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        res3 = findViewById(R.id.res3_tv);
        btn_5 = findViewById(R.id.calc3_btn);
        btn_6 = findViewById(R.id.firstpage_btn);
        et_x = findViewById(R.id.x_et);
        et_y = findViewById(R.id.y_et);
        et_m = findViewById(R.id.n_et);
        et_n = findViewById(R.id.m_et);
        et_a3 = findViewById(R.id.a3_et);
        }

    public void OnClick3(View v) {
        try {
            int x = Integer.parseInt(et_x.getText().toString());
            int y = Integer.parseInt(et_y.getText().toString());
            int m = Integer.parseInt(et_m.getText().toString());
            int n = Integer.parseInt(et_n.getText().toString());
            int a = Integer.parseInt(et_a3.getText().toString());
            double r = sqrt(pow(x, 2) + pow(y, 2));

            if (pow(m+x, 2) + pow(n+y, 2) <= pow(r, 2) && pow(m+x-a, 2) + pow(n+y, 2) <= pow(r,2) && pow(n+y-a, 2) + pow(m+x-a, 2) <= pow(r, 2)) {
                res3.setText("Результат: Принадлежит");
            }
            else {
                res3.setText("Результат: Не принадлежит");
            }
        }
        catch (ArithmeticException e) {
            res3.setText("ERROR !!!");
        }
    }
    public void startMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}