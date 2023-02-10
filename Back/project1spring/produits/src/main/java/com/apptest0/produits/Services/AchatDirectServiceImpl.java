package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.AchatDirectRepository;
import com.apptest0.produits.entity.AchatDirect;

import com.apptest0.produits.entity.AchatsD;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchatDirectServiceImpl implements AchatDirectService{
    @Autowired
    AchatDirectRepository achatDirectRepository;
 //   @Override
  //  public List<AchatDirect> getAachatDirect(){return achatDirectRepository.findAll();}

    @Override
    public List<AchatDirect> chercherParNtc(String ntc) {
        return achatDirectRepository.findByNtc(ntc);
    }




}
