package com.apptest0.produits.Controllers;

import com.apptest0.produits.Repos.AchatDirectRepository;
import com.apptest0.produits.Services.AchatDirectService;

import com.apptest0.produits.entity.AchatDirect;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

@RequestMapping("/achatsd/{ntcD}")
@CrossOrigin("*")
public class ControllerAchatsDall {

    @Autowired
    private AchatDirectService sv ;


    @RequestMapping(method = RequestMethod.GET)
    public List<AchatDirect> chercherParNtc(@PathVariable String ntcD) {
        return sv.chercherParNtc(ntcD);}









}










