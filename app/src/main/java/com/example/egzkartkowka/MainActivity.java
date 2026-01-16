package com.example.egzkartkowka;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> rzeczyDoZrobieniaArrayList;
    private ArrayAdapter<String> arrayAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
            listView = findViewById(R.id.lista);
            rzeczyDoZrobieniaArrayList = new ArrayList<>();
            rzeczyDoZrobieniaArrayList.add("Wyspać się");
            rzeczyDoZrobieniaArrayList.add("Wyspać się");
            arrayAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,rzeczyDoZrobieniaArrayList);
            listView.setAdapter(arrayAdapter);

    }
}