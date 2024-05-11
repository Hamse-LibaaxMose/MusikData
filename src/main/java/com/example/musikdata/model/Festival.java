package com.example.musikdata.model;

import java.util.Date;

public class Festival {
    private int id_festival;
    private Date datetime;
    private String city;
    private String festival_name;
    private String description;

    public Festival(int id_festival, Date datetime, String city, String festival_name, String description) {
        this.id_festival = id_festival;
        this.datetime = datetime;
        this.city = city;
        this.festival_name = festival_name;
        this.description = description;
    }

    public int getId_festival() {
        return id_festival;
    }

    public void setId_festival(int id_festival) {
        this.id_festival = id_festival;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFestival_name() {
        return festival_name;
    }

    public void setFestival_name(String festival_name) {
        this.festival_name = festival_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
