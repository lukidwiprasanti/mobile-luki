package com.example.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable { //Implement disini berfungsi sebagai listener dari adapter yang sudah tadi kita siapkan.
    private String title; //Menampung title
    private String genre; //Menampung genre
    private String director; //Menampung director
    private double rating; //Menampung rating
    private String description; //Menampung description
    private String releasedate; //Menampung release date

    public Movies(String title, String genre, String director, double rating, String description, String releasedate) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.rating = rating;
        this.description = description;
        this.releasedate = releasedate;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) { //WriteToParcel digunakan untuk objek yang ditulis adalah nilai balik, yaitu hasil dari fungsi
        dest.writeString(this.title);
        dest.writeString(this.genre);
        dest.writeString(this.director);
        dest.writeDouble(this.rating);
        dest.writeString(this.description);
        dest.writeString(this.releasedate);
    }

    public void readFromParcel(Parcel source) { //readFromParcel digunakan untuk membaca objek yang ditulis pada WriteToParcel
        this.title = source.readString();
        this.genre = source.readString();
        this.director = source.readString();
        this.rating = source.readDouble();
        this.description = source.readString();
        this.releasedate = source.readString();
    }

    protected Movies(Parcel in) {
        this.title = in.readString();
        this.genre = in.readString();
        this.director = in.readString();
        this.rating = in.readDouble();
        this.description = in.readString();
        this.releasedate = in.readString();
    }

    public static final Creator<Movies> CREATOR = new Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies(source);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };
}
