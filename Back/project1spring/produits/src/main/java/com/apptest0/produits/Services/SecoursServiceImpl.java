package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.AchatsDRepository;

import com.apptest0.produits.Repos.AvancesRepository;
import com.apptest0.produits.Repos.SecoursRepository;
import com.apptest0.produits.entity.AchatsD;
import com.apptest0.produits.entity.Avances;
import com.apptest0.produits.entity.Secours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecoursServiceImpl implements SecoursService{
    @Autowired
    SecoursRepository secoursRepository;


    @Override
    public List<Secours> getSecours() {
        return secoursRepository.findAll();
    }


}
