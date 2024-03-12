package com.example.musikdata.controller;

import com.example.musikdata.model.MusikData;
import com.example.musikdata.repository.MusikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller


public class MusikDataController {

    @Autowired
    MusikRepository repo;

    @GetMapping("/musikdata")
    public String listeMusikData(Model model) {

        // Henter collection af musik i repository
        List<MusikData> musikDataList = repo.fiveMusikData(); /* vi instantiere en liste som kun kan indholde Musikdata,
                                                                  vi kalder listen musikDataList; vi bruger vores Autowired objekt og kalder fiveMusikdata metoden. */
        //tilføjer musik til view model
        model.addAttribute("MusikListe",musikDataList);


        return "musik";
    }

}
