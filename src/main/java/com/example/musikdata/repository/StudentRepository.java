package com.example.musikdata.repository;

import com.example.musikdata.model.Album;
import com.example.musikdata.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getAll(){
        final String SELECT_All_SQL ="SELECT * FROM music_database.student";
        return jdbcTemplate.query(SELECT_All_SQL,new BeanPropertyRowMapper<>(Student.class));
    }
}
