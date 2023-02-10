package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.AchatsDRepository;

import com.apptest0.produits.entity.AchatsD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchatsDServiceImpl implements AchatsDService{
    @Autowired
    AchatsDRepository achatsDRepository;


    @Override
    public List<AchatsD> getAchat() {
        return achatsDRepository.findAll();
    }


}
