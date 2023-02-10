package com.apptest0.produits;

import com.apptest0.produits.Repos.ProduitRepository;
import com.apptest0.produits.entity.Produit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ProduitApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("PC Dell", 2200.500, new Date());
        produitRepository.save(prod);
    }
}
