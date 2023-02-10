package com.apptest0.produits.Controllers;

import com.apptest0.produits.Services.AchatDirectService;
import com.apptest0.produits.Services.AchatsDService;
import com.apptest0.produits.entity.AchatDirect;
import com.apptest0.produits.entity.AchatsD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/achatsd")
@CrossOrigin("*")
public class ControllerAchatsD {

    @Autowired
    private AchatsDService sv ;


    @RequestMapping(method = RequestMethod.GET)
    public List<AchatsD> getAchat() {
        return sv.getAchat();}



    }










