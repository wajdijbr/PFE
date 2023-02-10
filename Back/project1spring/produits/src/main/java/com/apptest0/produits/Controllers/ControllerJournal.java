package com.apptest0.produits.Controllers;
import com.apptest0.produits.Services.CaisseService;
import com.apptest0.produits.Services.JournalService;
import com.apptest0.produits.entity.Caisse;
import com.apptest0.produits.entity.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController

@RequestMapping("/journaux")
@CrossOrigin("*")
public class ControllerJournal {
    @Autowired
    private JournalService services;

    @RequestMapping(method = RequestMethod.GET)
    public List<Journal> getJournal() {
        return services.getJournal();
    }


}