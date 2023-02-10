package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.AchatDirectRepository;
import com.apptest0.produits.Repos.AvancesParNtcRepository;
import com.apptest0.produits.entity.AchatDirect;

import com.apptest0.produits.entity.AchatsD;
import com.apptest0.produits.entity.AvancesParNtc;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvancesParNtcServiceImpl implements AvancesParNtcService{
    @Autowired
    AvancesParNtcRepository avancesParNtcRepository;
    //   @Override
    //  public List<AchatDirect> getAachatDirect(){return achatDirectRepository.findAll();}

    @Override
    public List<AvancesParNtc> avParNtc(String ntc) {
        return avancesParNtcRepository.findByNtc(ntc);
    }




}
