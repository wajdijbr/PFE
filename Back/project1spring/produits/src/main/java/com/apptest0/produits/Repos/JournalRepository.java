package com.apptest0.produits.Repos;
import com.apptest0.produits.entity.Caisse;
import com.apptest0.produits.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
