package com.apptest0.produits.Repos;

import com.apptest0.produits.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
