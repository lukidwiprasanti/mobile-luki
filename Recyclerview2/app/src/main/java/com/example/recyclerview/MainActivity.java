package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>(); //Menampung data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview); //Memanggil recyclerview

        objMovies.add(new Movies("The Shawshank Redemption", "Drama", "Frank Darabont", 9.3, "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", "1994"));
        objMovies.add(new Movies("The Godfather", "Crime, Drama", "Francis Ford Coppola", 9.2, "An organized crime dynasty's aging patriarch transfers control of his clandestine empire to his reluctant son.", "1972"));
        objMovies.add(new Movies("The Dark Knight", "Action, Crime, Drama", "Christopher Nolan", 9.0, "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.", "2008"));
        objMovies.add(new Movies("Pulp Fiction", "Crime, Drama", "Quentino Tarantino", 8.9, "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", "1994"));
        objMovies.add(new Movies("Whiplash", "Drama, Music", "Damain Chazelle", 8.5, "A promising young drummer enrolls at a cut-throat music conservatory where his dreams of greatness are mentored by an instructor who will stop at nothing to realize a student's potential.", "2014"));

        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}