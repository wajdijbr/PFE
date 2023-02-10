package com.apptest0.produits.Repos;
import com.apptest0.produits.entity.AchatDirect;
import com.apptest0.produits.entity.AchatsD;
import com.apptest0.produits.entity.AvancesParNtc;
import com.apptest0.produits.entity.Caisse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvancesParNtcRepository extends JpaRepository<AvancesParNtc, Long> {
    List<AvancesParNtc> findByNtc(String ntc);


}
