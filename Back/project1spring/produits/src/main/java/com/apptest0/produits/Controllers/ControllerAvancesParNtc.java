package com.apptest0.produits.Controllers;

import com.apptest0.produits.Repos.AchatDirectRepository;
import com.apptest0.produits.Services.AchatDirectService;

import com.apptest0.produits.Services.AvancesParNtcService;
import com.apptest0.produits.entity.AchatDirect;

import com.apptest0.produits.entity.AvancesParNtc;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

@RequestMapping("/avances/{ntcD}")
@CrossOrigin("*")
public class ControllerAvancesParNtc {

    @Autowired
    private AvancesParNtcService sv ;


    @RequestMapping(method = RequestMethod.GET)
    public List<AvancesParNtc>  avParNtc(@PathVariable String ntcD) {
        return sv.avParNtc(ntcD);}









}










