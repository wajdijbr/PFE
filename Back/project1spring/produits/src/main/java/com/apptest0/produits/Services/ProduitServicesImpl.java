package com.apptest0.produits.Services;

import com.apptest0.produits.Repos.ProduitRepository;
import com.apptest0.produits.entity.Produit;
import com.sun.xml.bind.v2.model.core.ID;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitServicesImpl implements ProduitServices{
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }
    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);
    }
    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }
    @Override
    public Produit getProduit(Long id) throws NotFoundException {
        Produit prod = produitRepository.findById(id).get();
        if(prod  ==  null) throw new NotFoundException("Actor Not Found", new Exception());
        return prod;
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }



}
