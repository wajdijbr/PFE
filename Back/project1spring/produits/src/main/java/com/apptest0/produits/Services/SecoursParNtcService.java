package com.apptest0.produits.Services;

import com.apptest0.produits.entity.AchatDirect;
import com.apptest0.produits.entity.AvancesParNtc;
import com.apptest0.produits.entity.Produit;
import com.apptest0.produits.entity.SecoursParNtc;
import javassist.NotFoundException;

import javax.swing.*;
import java.util.List;

public interface SecoursParNtcService {


    List<SecoursParNtc> avParNtc(String ntc);

    //  List<AchatDirect> getAchatDirectByNTC(String ntc);

}
