package com.apptest0.produits.Services;

import com.apptest0.produits.entity.AchatDirect;
import com.apptest0.produits.entity.Produit;
import javassist.NotFoundException;

import javax.swing.*;
import java.util.List;

public interface AchatDirectService {


    List<AchatDirect> chercherParNtc(String ntc);

    //  List<AchatDirect> getAchatDirectByNTC(String ntc);

}
