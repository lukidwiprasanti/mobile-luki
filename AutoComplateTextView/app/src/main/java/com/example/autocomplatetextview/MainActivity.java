package com.example.autocomplatetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity { //Class MainActivity yang merupakan turunan dari Class AppCompatActivity dan mengimplementasikan Interface View.OnClickListener untuk meng-handle event onClick().

    private static final  String[] CITIES = new String[]{ //Daftar item menggunakan array
            "Arab Saudi", "Afganistan", "Amerika Serikat", "Aistralia", "Chinna", "DenMark", "Filipina",
            "Ghana", "Indonesia", "Kamboja", "Malaysia", "Inggris", "Singapura", "Laos", "Brunai Darusalam", " Afrika", "Jerman",
            "Turki", "Prancis"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Memanggil implementasi dari superclass
        super.onCreate(savedInstanceState); //Menjalankan kode selain kode yang ada di kelas induk
        setContentView(R.layout.activity_main); //Untuk menyetel tata letak xml

        AutoCompleteTextView editText = findViewById(R.id.actv); //Memanggil listview pada activity_main.xml
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CITIES); //Memanggil daftar item yang disediakan array
        editText.setAdapter(adapter); //Menetapkan adaptor pada baris sebelumnya
    }
}