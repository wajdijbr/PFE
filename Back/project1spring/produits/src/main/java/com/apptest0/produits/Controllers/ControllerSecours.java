package com.apptest0.produits.Controllers;

import com.apptest0.produits.Services.AchatDirectService;
import com.apptest0.produits.Services.AchatsDService;
import com.apptest0.produits.Services.AvancesService;
import com.apptest0.produits.Services.SecoursService;
import com.apptest0.produits.entity.AchatDirect;
import com.apptest0.produits.entity.AchatsD;
import com.apptest0.produits.entity.Avances;
import com.apptest0.produits.entity.Secours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/secours")
@CrossOrigin("*")
public class ControllerSecours {

    @Autowired
    private SecoursService sv ;


    @RequestMapping(method = RequestMethod.GET)
    public List<Secours> getSecours() {
        return sv.getSecours();}



}










