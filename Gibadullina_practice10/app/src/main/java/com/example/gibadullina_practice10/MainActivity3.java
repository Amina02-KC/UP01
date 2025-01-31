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

public class MainActivity3 extends AppCompatActivity {
    TextView title3,tv_onekgch, tv_onekgtof, tv_comp;
    Button btn_5, btn_6;
    EditText et_kgchoco,et_price1, et_kgtoffee, et_price2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        et_kgchoco = findViewById(R.id.chocokg_et);
        et_price1 = findViewById(R.id.chocoprice_et);
        et_kgtoffee = findViewById(R.id.toffeekg_et);
        et_price2 = findViewById(R.id.toffeeprice_et);
        btn_5 = findViewById(R.id.calc3_btn);
        btn_6 = findViewById(R.id.firstpage_btn);
        tv_onekgch = findViewById(R.id.onechocokg_tv);
        tv_onekgtof = findViewById(R.id.onetoffeekg_tv);
        tv_comp = findViewById(R.id.comp_tv);
        }

        public void OnClick3(View view) {
            int x = Integer.parseInt(et_kgchoco.getText().toString());
            int a = Integer.parseInt(et_price1.getText().toString());
            int y = Integer.parseInt(et_kgtoffee.getText().toString());
            int b = Integer.parseInt(et_price2.getText().toString());

            int c = a/x;
            int d = b/y;

            tv_onekgch.setText("1 кг конфет = " + c);
            tv_onekgtof.setText("1 кг ирисок = " + d);
            tv_comp.setText("Результат: " + (c/d));
        }

        public void startMainActivity(View view) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
}
