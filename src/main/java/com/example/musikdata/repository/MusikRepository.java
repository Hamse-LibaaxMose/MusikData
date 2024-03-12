package com.example.musikdata.repository;

import com.example.musikdata.model.MusikData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusikRepository {

    public List<MusikData> fiveMusikData(){

        MusikData musikData1 = new MusikData("Eminem", "United States", "Rap", "The Marshall Mathers LP", 320);
        MusikData musikData2 = new MusikData("Kanye West", "United States", "Hip Hop", "My Beautiful Dark Twisted Fantasy", 270);
        MusikData musikData3 = new MusikData("Adele", "United Kingdom", "Pop", "21", 280);
        MusikData musikData4 = new MusikData("Nas", "Canada", "R&B", "Take Care", 310);
        MusikData musikData5 = new MusikData("Diddy", "South Korea", "K-pop", "Map of the Soul: 7", 300);


        ArrayList<MusikData> musikDataArrayList = new ArrayList<>();
        musikDataArrayList.add(musikData1);
        musikDataArrayList.add(musikData2);
        musikDataArrayList.add(musikData3);
        musikDataArrayList.add(musikData4);
        musikDataArrayList.add(musikData5);

        return musikDataArrayList;

    }
}