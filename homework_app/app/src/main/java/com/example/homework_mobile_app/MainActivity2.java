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

public class MainActivity2 extends AppCompatActivity {
    TextView title2, res2;
    Button btn_3, btn_4;
    EditText et_a1, et_b1, et_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_a1 = findViewById(R.id.a1_et);
        et_b1 = findViewById(R.id.b1_et);
        et_c = findViewById(R.id.c_et);
        btn_3 = findViewById(R.id.calc2_btn);
        btn_4 = findViewById(R.id.thirdpage_btn);
        res2 = findViewById(R.id.res2_tv);
    }

    public void OnClick2(View v) {
        try {
            int a = Integer.parseInt(et_a1.getText().toString());
            int b = Integer.parseInt(et_b1.getText().toString());
            int c = Integer.parseInt(et_c.getText().toString());
            int d = a * b;
            int e = b * c;
            String res = min(d, e) + " " + max(d, e);
            res2.setText("Результат: " + res);
        }
        catch (ArithmeticException e) {
            res2.setText("Ошибка");
        }
    }
    public void startThirdActivity(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}