package com.example.sunnysideup_evijayantiyonardi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivtyApk extends AppCompatActivity {
    String foodList[] = {"Fried Rice", "Satay", "French Fries"};
    int foodImages [] = {R.drawable.friedrice, R.drawable.satay, R.drawable.frenchfries};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activty_apk);
        listView = (ListView) findViewById(R.id.CustomListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), foodList, foodImages);
        listView.setAdapter(customBaseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("COSTOM_LIST_VIEW", "Item is clicked @ Position :: ");
            }
        });
    }
}