package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailMovieActivity extends AppCompatActivity {

    TextView textViewTitle, textViewRating, textViewGenre, textViewReleaseDate, textViewDirector, textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        textViewTitle = findViewById(R.id.tvTitle); //Memanggil Tittle
        textViewRating = findViewById(R.id.tvRating); //Memanggil Rating
        textViewGenre = findViewById(R.id.tvGenre); //Memanggil Genre
        textViewReleaseDate = findViewById(R.id.tvReleaseDate); //Memanggil Release Data
        textViewDirector = findViewById(R.id.tvDirector); //Memanggil Director
        textViewDescription = findViewById(R.id.tvDescription); //Memanggil Description

        Movies movies = getIntent().getParcelableExtra("MOVIES");
        textViewTitle.setText(movies.getTitle());
        textViewRating.setText(String.valueOf(movies.getRating()));
        textViewGenre.setText(movies.getGenre());
        textViewReleaseDate.setText(movies.getReleasedate());
        textViewDirector.setText(movies.getDirector());
        textViewDescription.setText(movies.getDescription());
    }
}