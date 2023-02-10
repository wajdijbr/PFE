package com.apptest0.produits.Controllers;

import com.apptest0.produits.Repos.AchatDirectRepository;
import com.apptest0.produits.Services.AchatDirectService;

import com.apptest0.produits.Services.AvancesParNtcService;
import com.apptest0.produits.Services.SecoursParNtcService;
import com.apptest0.produits.entity.AchatDirect;

import com.apptest0.produits.entity.AvancesParNtc;
import com.apptest0.produits.entity.SecoursParNtc;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

@RequestMapping("/secours/{ntcD}")
@CrossOrigin("*")
public class ControllerSecoursParNtc {

    @Autowired
    private SecoursParNtcService sv ;


    @RequestMapping(method = RequestMethod.GET)
    public List<SecoursParNtc>  avParNtc(@PathVariable String ntcD) {
        return sv.avParNtc(ntcD);}









}










