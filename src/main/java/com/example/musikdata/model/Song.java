package com.example.musikdata.model;


public class Song {
   private String genre;
   private int duration;
   private int song_id;
   private int album_id;

   public Song() {
   }

   public Song(String genre, int duration, int song_id, int album_id) {
      this.genre = genre;
      this.duration = duration;
      this.song_id = song_id;
      this.album_id = album_id;
   }

   public Song(String genre, int duration, int album_id) {
      this.genre = genre;
      this.duration = duration;
      this.album_id = album_id;
   }

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public int getDuration() {
      return duration;
   }

   public void setDuration(int duration) {
      this.duration = duration;
   }

   public int getSong_id() {
      return song_id;
   }

   public void setSong_id(int song_id) {
      this.song_id = song_id;
   }

   public int getAlbum_id() {
      return album_id;
   }

   public void setAlbum_id(int album_id) {
      this.album_id = album_id;
   }
}

