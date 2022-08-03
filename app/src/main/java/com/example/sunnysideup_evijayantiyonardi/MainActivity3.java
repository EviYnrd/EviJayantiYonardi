package com.example.sunnysideup_evijayantiyonardi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RadioGroup rg;

        RadioButton Pria,Wanita;

        TextView textView;

        Button button;

        rg = findViewById(R.id.tes);
        Pria = findViewById(R.id.Pria);
        Wanita = findViewById(R.id.Wanita);

        textView = findViewById(R.id.textView);

        button = findViewById(R.id.button);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.Pria :
                        Toast.makeText(getApplication(), "Saya adalah Pria", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.Wanita :
                        Toast.makeText(getApplication(), "Saya adalah Wanita", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}