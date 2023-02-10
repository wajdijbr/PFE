package com.apptest0.produits.Services;

import com.apptest0.produits.entity.Produit;
import com.sun.xml.bind.v2.model.core.ID;
import javassist.NotFoundException;

import java.util.List;

public interface ProduitServices {

    Produit saveProduit(Produit p);

    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id) throws NotFoundException;
    List<Produit> getAllProduits();
}
