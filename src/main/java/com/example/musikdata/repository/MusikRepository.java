package com.example.musikdata.repository;

import com.example.musikdata.model.Album;
import com.example.musikdata.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


@Repository   // repository-klassen står for at snakke med databasen.
public class MusikRepository {
   @Autowired
    private JdbcTemplate jdbcTemplate;



    public List<Album> findAll(){
        // sql string
        final String SELECT_SQL ="SELECT * FROM music_database.album";
        return jdbcTemplate.query(SELECT_SQL, new BeanPropertyRowMapper<>(Album.class));
        //return jdbcTemplate BeanMapper

    };
        public void makeAlbum(Album album){
            final String INSERT_SQL = "INSERT INTO album(kunstnerens_name," +
                    " oprindelesLand, albumNavn) VALUES(?, ?, ?)";
            jdbcTemplate.update(INSERT_SQL, album.getKunstnerens_name(), album.getOprindelesLand(), album.getAlbumNavn());

        }

    public void update(Song song){
            //id skal bruges
        final String UPDATE_SQL = "UPDATE music SET oprindelesLand = ?, kunstnerens_name = ?, genre = ?, albumNavn = ?, duration = ? WHERE music_id = ?";
        //jdbcTemplate.update(UPDATE_SQL, song.getOprindelesLand(), song.getKunstnerens_name(),  song.getGenre(), song.getAlbumNavn(), song.getDuration(), song.getPRIMARY_KEY());
    }

    public Song findById(int id){
        final String FIND_BY_ID_SQL = "SELECT * FROM albums WHERE idalbum = ?;";
        RowMapper<Song> rowMapper = new BeanPropertyRowMapper<>(Song.class);
        return jdbcTemplate.queryForObject(FIND_BY_ID_SQL, rowMapper, id);
    }

    public void delete (int PRIMARY_KEY){
            final String DELETE_SQL = "DELETE FROM music WHERE music_id = ?";
            jdbcTemplate.update(DELETE_SQL, PRIMARY_KEY);

    }

    /*
     public void makeAlbum(Album album){
            final String INSERT_SQL = "INSERT INTO album(kunstnerens_name," +
                    " oprindelesLand, albumNavn) VALUES(?, ?, ?)";
            jdbcTemplate.update(INSERT_SQL, album.getKunstnerens_name(), album.getOprindelesLand(), album.getAlbumNavn());

        }
     */

    public void makeSong(Song songData) {
        final String INSERT_SQL = "INSERT INTO song( genre, duration, album_id) VALUES (?, ?, ?)";
        jdbcTemplate.update(INSERT_SQL, songData.getGenre(),songData.getDuration(),songData.getAlbum_id());
    }
}