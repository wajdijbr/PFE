package com.apptest0.produits.Controllers;
import com.apptest0.produits.Services.CaisseService;
import com.apptest0.produits.Services.SoldesService;
import com.apptest0.produits.entity.Caisse;
import com.apptest0.produits.entity.Soldes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController

@RequestMapping("/soldes")
@CrossOrigin("*")
public class ControllerSoldes {
    @Autowired
    private SoldesService services;

    @RequestMapping(method = RequestMethod.GET)
    public List<Soldes> getSolde() {
        return services.getSolde();
    }


}