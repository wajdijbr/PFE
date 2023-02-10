package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.AchatDirectRepository;
import com.apptest0.produits.Repos.AvancesParNtcRepository;
import com.apptest0.produits.Repos.SecoursParNtcRepository;
import com.apptest0.produits.entity.AchatDirect;

import com.apptest0.produits.entity.AchatsD;
import com.apptest0.produits.entity.AvancesParNtc;
import com.apptest0.produits.entity.SecoursParNtc;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecoursParNtcServiceImpl implements SecoursParNtcService{
    @Autowired
    SecoursParNtcRepository secoursParNtcRepository;
    //   @Override
    //  public List<AchatDirect> getAachatDirect(){return achatDirectRepository.findAll();}

    @Override
    public List<SecoursParNtc> avParNtc(String ntc) {
        return secoursParNtcRepository.findByNtc(ntc);
    }




}
