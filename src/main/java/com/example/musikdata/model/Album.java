package com.example.musikdata.model;

public class Album {
    String albumNavn;
    String oprindelesLand;
    String kunstnerens_name;
    int album_id;

    public Album(String albumNavn, String oprindelesLand, String kunstnerens_name, int album_id) {
        this.albumNavn = albumNavn;
        this.oprindelesLand = oprindelesLand;
        this.kunstnerens_name = kunstnerens_name;
        this.album_id = album_id;

    }

    public Album(String albumNavn, String oprindelesLand, String kunstnerens_name) {
        this.albumNavn = albumNavn;
        this.oprindelesLand = oprindelesLand;
        this.kunstnerens_name = kunstnerens_name;
    }

    public Album() {
    }

    public String getAlbumNavn() {
        return albumNavn;
    }

    public void setAlbumNavn(String albumNavn) {
        this.albumNavn = albumNavn;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getOprindelesLand() {
        return oprindelesLand;
    }

    public void setOprindelesLand(String oprindelesLand) {
        this.oprindelesLand = oprindelesLand;
    }

    public String getKunstnerens_name() {
        return kunstnerens_name;
    }

    public void setKunstnerens_name(String kunstnerens_name) {
        this.kunstnerens_name = kunstnerens_name;
    }


}

