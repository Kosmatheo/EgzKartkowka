package com.example.egzkartkowka;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

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
    private Button buttonDodaj;
    private EditText editTextRzeczDoZrobienia;

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
            editTextRzeczDoZrobienia = findViewById(R.id.editTextText);
            buttonDodaj = findViewById(R.id.button);
            rzeczyDoZrobieniaArrayList = new ArrayList<>();
            rzeczyDoZrobieniaArrayList.add("Wyspać się");
            rzeczyDoZrobieniaArrayList.add("zrobić coś");
            arrayAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,rzeczyDoZrobieniaArrayList);
            listView.setAdapter(arrayAdapter);
    buttonDodaj.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rzecz = editTextRzeczDoZrobienia.getText().toString();
                    rzeczyDoZrobieniaArrayList.add(rzecz);
                    arrayAdapter.notifyDataSetChanged();
                    editTextRzeczDoZrobienia.setText("");
                }
            }
    );
    listView.setOnItemClickListener(
            new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    /*view.setBackgroundColor(Color.GRAY);
                    TextView textView = (TextView) view;
                    textView.setTextColor(Color.WHITE);
                    textView.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);*/
                    rzeczyDoZrobieniaArrayList.remove(i);
                    arrayAdapter.notifyDataSetChanged();
                }
            }
    );
    }


}