package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity { //Class MainActivity yang merupakan turunan dari Class AppCompatActivity dan mengimplementasikan Interface View.OnClickListener untuk meng-handle event onClick().

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listView); //Memanggil list view pada activity_main.xml
        String[] namaHewan = {"Ayam", "Babi", "Cicak", "Domba", "Elang", "Gajah", "Harimau", "Ikan", "Jerapah", "Kucing", "Kanguru", "Badak", "Ular"}; //Daftar list view (daftar item)
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(  this, android.R.layout.simple_list_item_1, namaHewan); //Memanggil daftar item yang disediakan array

        list.setAdapter(myAdapter); //Menetapkan sebuah adaptor pada baris sebelumnya

    }
}