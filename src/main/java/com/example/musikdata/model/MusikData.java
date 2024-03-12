package com.example.musikdata.model;

public class MusikData {
   private String kunstnerens_name;
   private String oprindelesLand;
   private String genre;
   private String albumNavn;
   private int duration;

    public MusikData(String kunstnerens_name, String oprindelesLand, String genre, String albumNavn, int duration) {
        this.kunstnerens_name = kunstnerens_name;
        this.oprindelesLand = oprindelesLand;
        this.genre = genre;
        this.albumNavn = albumNavn;
        this.duration = duration;
    }

    public MusikData() {
    }

    public String getKunstnerens_name() {
        return kunstnerens_name;
    }

    public void setKunstnerens_name(String kunstnerens_name) {
        this.kunstnerens_name = kunstnerens_name;
    }

    public String getOprindelesLand() {
        return oprindelesLand;
    }

    public void setOprindelesLand(String oprindelesLand) {
        this.oprindelesLand = oprindelesLand;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbumNavn() {
        return albumNavn;
    }

    public void setAlbumNavn(String albumNavn) {
        this.albumNavn = albumNavn;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
