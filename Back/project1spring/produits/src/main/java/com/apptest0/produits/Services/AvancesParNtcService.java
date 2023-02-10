package com.apptest0.produits.Services;

import com.apptest0.produits.entity.AchatDirect;
import com.apptest0.produits.entity.AvancesParNtc;
import com.apptest0.produits.entity.Produit;
import javassist.NotFoundException;

import javax.swing.*;
import java.util.List;

public interface AvancesParNtcService {


    List<AvancesParNtc> avParNtc(String ntc);

    //  List<AchatDirect> getAchatDirectByNTC(String ntc);

}
