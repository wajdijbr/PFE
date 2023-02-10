package com.apptest0.produits.Controllers;
import com.apptest0.produits.Services.CaisseService;
import com.apptest0.produits.entity.Caisse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController

@RequestMapping("/caisse")
@CrossOrigin("*")
public class ControllerCaisse {
    @Autowired
    private CaisseService services;

    @RequestMapping(method = RequestMethod.GET)
    public List<Caisse> getAllCaisse() {
        return services.getAllCaisse();
    }


}