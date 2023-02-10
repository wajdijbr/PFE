package com.apptest0.produits.Repos;

import com.apptest0.produits.entity.Produit;
import com.apptest0.produits.entity.Soldes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldesRepository extends JpaRepository<Soldes, Long> {

}
