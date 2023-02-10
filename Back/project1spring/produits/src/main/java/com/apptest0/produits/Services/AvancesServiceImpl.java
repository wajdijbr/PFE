package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.AchatsDRepository;

import com.apptest0.produits.Repos.AvancesRepository;
import com.apptest0.produits.entity.AchatsD;
import com.apptest0.produits.entity.Avances;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvancesServiceImpl implements AvancesService{
    @Autowired
    AvancesRepository avancesRepository;


    @Override
    public List<Avances> getAvances() {
        return avancesRepository.findAll();
    }


}
