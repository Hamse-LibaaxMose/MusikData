package com.example.musikdata.repository;

import com.example.musikdata.model.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FestivalRepo {
@Autowired
private JdbcTemplate jdbcTemplate;

public List<Festival> findAll(){
    String SQL_GetAll = "select * FROM musicdata.festival";
    RowMapper<Festival> festivalRowMapper = new BeanPropertyRowMapper<>(Festival.class);
    return jdbcTemplate.query(SQL_GetAll, festivalRowMapper);
  }

}
