package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.CaisseRepository;
import com.apptest0.produits.Repos.SoldesRepository;
import com.apptest0.produits.entity.Caisse;
import com.apptest0.produits.entity.Soldes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SoldesServiceImpl implements SoldesService {
    @Autowired
    SoldesRepository soldesRepository;

    @Override
    public List<Soldes> getSolde() {
        return soldesRepository.findAll();
    }


}