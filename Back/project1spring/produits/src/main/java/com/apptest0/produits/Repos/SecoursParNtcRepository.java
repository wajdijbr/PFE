package com.apptest0.produits.Repos;
import com.apptest0.produits.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecoursParNtcRepository extends JpaRepository<SecoursParNtc, Long> {
    List<SecoursParNtc> findByNtc(String ntc);


}
