package com.example.gibadullina_practice10;

import static java.lang.Math.abs;

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
    TextView title2, tv_x1, tv_y1, tv_x2, tv_y2, tv_s2, tv_p;
    Button x1y1, x2y2, btn_3, btn_4;
    EditText et_x1, et_y1, et_x2, et_y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_x1 = findViewById(R.id.x1_et);
        et_y1 = findViewById(R.id.y1_et);
        et_x2 = findViewById(R.id.x2_et);
        et_y2 = findViewById(R.id.y2_et);
        btn_3 = findViewById(R.id.thirdpage_btn);
        btn_4 = findViewById(R.id.calc2_btn);
        tv_s2 = findViewById(R.id.s2_tv);
        tv_p = findViewById(R.id.p_tv);
    }

    public void OnClick2(View view) {
        int x1 = Integer.parseInt(et_x1.getText().toString());
        int y1 = Integer.parseInt(et_y1.getText().toString());
        int x2 = Integer.parseInt(et_x2.getText().toString());
        int y2 = Integer.parseInt(et_y2.getText().toString());
        int a = abs(x2 - x1);
        int b = abs(y2 - y1);

        int S = a * b;
        int P = 2 * (a + b);

        tv_s2.setText("S = " + S);
        tv_p.setText("P = " + P);

    }
    public void startThirdActivity(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}