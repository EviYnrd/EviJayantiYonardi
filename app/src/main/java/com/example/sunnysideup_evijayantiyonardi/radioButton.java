package com.example.sunnysideup_evijayantiyonardi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class radioButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        RadioGroup radioGroup;

        RadioButton radioButtonPria;
        RadioButton radioButtonWanita;

        Button radioButton;

        Button radioButtonTes;

        TextView textView;


        radioGroup = findViewById(R.id.radioGroup1);

        radioButtonPria = findViewById(R.id.pria);
        radioButtonWanita = findViewById(R.id.wanita);

        radioButton = findViewById(R.id.buttonRadio);

        radioButtonTes = findViewById(R.id.ButtonTes);

        textView = findViewById(R.id.textViewRadio);

        final String[] text = {"Evi"};

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.pria :
                        Toast.makeText(getApplication(), "Saya adalah Pria", Toast.LENGTH_SHORT).show();
                        text[0] = "Pria";
                        break;

                    case R.id.wanita :
                        Toast.makeText(getApplication(), "Saya adalah Wanita", Toast.LENGTH_SHORT).show();
                        text[0] = "Wanita";
                        break;
                }
            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kalau button dipencet
                textView.setText(text[0]);
            }
        });

        radioButtonTes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(radioButton.this,MainActivity2.class);
                String teks = "Hello World";
                intent.putExtra("keys", teks);
                startActivity(intent);
            }
        });
    }
}