package com.example.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesRecyclerViewAdapter extends RecyclerView.Adapter<MoviesRecyclerViewAdapter.MovieViewHolder> {
    ArrayList<Movies> arrayListMovies;

    public MoviesRecyclerViewAdapter(ArrayList<Movies> arrayListMovies){
        this.arrayListMovies = arrayListMovies;
    }

    @NonNull
    @Override
    public MoviesRecyclerViewAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //onCreateViewHolder digunakan recyclerview memanggil metode ini setiap kali perlu membuat ViewHolder baru. Metode ini membuat serta menginisialisasi ViewHolder dan View-nya yang diatribusikan, tetapi tidak mengisi konten tampilan—ViewHolder belum terikat dengan data tertentu.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesRecyclerViewAdapter.MovieViewHolder holder, int position) { //onBindViewHolder digunakan recyclerview memanggil metode ini untuk mengatribusikan ViewHolder dengan data.
        final Movies movies = arrayListMovies.get(position);

        holder.textViewTitle.setText(movies.getTitle());
        holder.textViewRating.setText(String.valueOf(movies.getRating()));
        holder.textViewReleaseDate.setText(movies.getReleasedate());

        holder.itemView.setOnClickListener(new View.OnClickListener() { //onClickListener. Ini akan dipanggil setiap kali tombol Submit ditekan. Ketika itu terjadi, rincian yang dimasukkan harus dikumpulkan dan dikirim ke aktivitas berikutnya.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailMovieActivity.class);
                intent.putExtra("MOVIES", movies);
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() { //GetItemCount digunakan RecyclerView memanggil metode ini untuk mendapatkan ukuran set data.
        return arrayListMovies.size(); }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewRating, textViewReleaseDate;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.tvTitle);
            textViewRating = itemView.findViewById(R.id.tvRating);
            textViewReleaseDate = itemView.findViewById(R.id.tvReleaseDate);
        }
    }
}
