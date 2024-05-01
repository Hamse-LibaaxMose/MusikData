package com.example.musikdata.controller;

import com.example.musikdata.model.Album;
import com.example.musikdata.model.Song;
import com.example.musikdata.repository.MusikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller


public class MusikDataController {
    @Autowired
    MusikRepository musikRepository;

    @PostMapping("/saveMusic")
    public String requestMusic(@RequestParam("kunstnerens_name") String kunstnerens_name,
                               @RequestParam("oprindelesLand") String oprindelesLand,

                               @RequestParam("albumNavn") String albumNavn)
                              {

        Album albumdata = new Album(kunstnerens_name, oprindelesLand, albumNavn);

        musikRepository.makeAlbum(albumdata);

        return "redirect:/";

    }

    @PostMapping("/saveSong")
    public String saveSong(@RequestParam("genre") String genre,
                               @RequestParam("duration") int duration,

                               @RequestParam("album_id") int album_id)
    {

        Song songData = new Song(genre, duration, album_id);

        musikRepository.makeSong(songData);

        return "redirect:/";

    }


    @GetMapping("/")
    public String index() {
        return "redirect:/musikdata";
    }

    @GetMapping("/musikdata")
    public String listeMusikData(Model model) {

        // Henter collection af musik i repository
        List<Album> albumList = musikRepository.findAll(); /* vi instantiere en liste som kun kan indholde Musikdata,
                                                                  vi kalder listen musikDataList; vi bruger vores Autowired objekt og kalder fiveMusikdata metoden. */
        //tilføjer musik til view model
        model.addAttribute("MusikListe", albumList);


        return "musik";
    }

    @GetMapping("/update/{id}")
    public String showUpdateO(@PathVariable("id") int updateId, Model model) {
        //find musikData med idalbum = updateId i databasen
        Song updateSong = musikRepository.findById(updateId);

        // tilføj produkt til viewmodel, så der kan bruges i Thymeleaf
        model.addAttribute(("musikdata"), updateSong);

        //fortæl Spring hvilken HTML-side, der vises
        return "updatemusik";
    }

    @PostMapping("/update")
    public String updateMusikData(@RequestParam("kunstnerens_name") String kunstnerens_name,
                                  @RequestParam("oprindelesLand") String oprindelesLand,
                                  @RequestParam("genre") String genre,
                                  @RequestParam("albumNavn") String idalbumNavn,
                                  @RequestParam("duration") int duration,
                                  @RequestParam("PRIMARY_KEY") int primary_key)
    {
        //lav musicData
      //  Song song = new Song(kunstnerens_name, oprindelesLand, genre, idalbumNavn, duration, primary_key);

      //  musikRepository.update(song);
        return "redirect:/";


    }
    @GetMapping("/delete")
    public String deleteMusikdata(@RequestParam("PRIMARY KEY") int primary_key){

        musikRepository.delete(primary_key);
        return "redirect:/";

    }
}
