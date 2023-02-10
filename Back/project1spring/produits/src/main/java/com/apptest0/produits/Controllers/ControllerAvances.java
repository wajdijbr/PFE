package com.apptest0.produits.Controllers;

import com.apptest0.produits.Services.AchatDirectService;
import com.apptest0.produits.Services.AchatsDService;
import com.apptest0.produits.Services.AvancesService;
import com.apptest0.produits.entity.AchatDirect;
import com.apptest0.produits.entity.AchatsD;
import com.apptest0.produits.entity.Avances;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/avances")
@CrossOrigin("*")
public class ControllerAvances {

    @Autowired
    private AvancesService sv ;


    @RequestMapping(method = RequestMethod.GET)
    public List<Avances> getAvances() {
        return sv.getAvances();}



}










