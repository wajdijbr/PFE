package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.CaisseRepository;
import com.apptest0.produits.entity.Caisse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CaisseServiceImpl implements CaisseService {
    @Autowired
    CaisseRepository caisseRepository;

    @Override
    public List<Caisse> getAllCaisse() {
        return caisseRepository.findAll();
    }


}