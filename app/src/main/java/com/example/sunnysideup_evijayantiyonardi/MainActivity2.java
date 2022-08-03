package com.example.sunnysideup_evijayantiyonardi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn;

        TextView Text2;

        btn = findViewById(R.id.blabla);

        Text2 = findViewById(R.id.textView2);

        String teks = getIntent().getStringExtra("keys");

        Text2.setText(teks);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code

                Toast.makeText(getApplicationContext(),
                        "blabla here",
                        Toast.LENGTH_SHORT).show();


            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,radioButton.class);
                startActivity(intent);
            }
        });



    }
}