package com.example.gibadullina_practice10;

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
    TextView title1,tv_v,tv_s;
    EditText et_a,et_b,et_c;
    Button btn_1,btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_a = findViewById(R.id.a_et);
        et_b = findViewById(R.id.b_et);
        et_c = findViewById(R.id.c_et);
        tv_v = findViewById(R.id.v_tv);
        tv_s = findViewById(R.id.s_tv);
        btn_1 = findViewById(R.id.secondpage_btn);
        btn_2 = findViewById(R.id.calc_btn);
    }
    public void OnClick(View view) {
        int a = Integer.parseInt(et_a.getText().toString());
        int b = Integer.parseInt(et_b.getText().toString());
        int c = Integer.parseInt(et_c.getText().toString());
        int V = a * b * c;
        int S = 2 * ((a * b) + (b * c) + (a * c));

        tv_v.setText("V = " + V);
        tv_s.setText("S = " + S);
    }
    public void startNewActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}