package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;  //Digunakan untuk memanggil Fungsi dari Spinner
    ArrayAdapter<String> arrayAdapter; //memanggil data dari string
    String[] language = {"C", "C++", "Java", "JavaScript", "Phyton", "HTML", "CSS"}; //Data yang ditammpilkan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner2); //Mendapatkan id dari spinner untuk memanggil resourece dari item dan membuat adapter dari spinner
        arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, language); //memanggil array
        spinner.setAdapter(arrayAdapter); //Atur adaptor untuk menyediakan tata letak baris dan konten

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //Atur untuk melakukan tindakan berdasarkan pemilihan item
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) { //Metode panggilan balik yang akan dipanggil saat item dalam tampilan ini telah dipilih.
                Toast.makeText(MainActivity.this, "You Select "+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show(); //proses pesan saat di klik
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { //Metode panggilan balik yang akan dipanggil saat pilihan menghilang dari tampilan ini.

            }
        });

    }
}