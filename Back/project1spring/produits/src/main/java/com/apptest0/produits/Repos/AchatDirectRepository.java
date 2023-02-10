package com.apptest0.produits.Repos;
import com.apptest0.produits.entity.AchatDirect;
import com.apptest0.produits.entity.Caisse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AchatDirectRepository extends JpaRepository<AchatDirect, Long> {

    //@Query("SELECT v.ur,v.numPc,v.dtReal,v.montant FROM V_SUIVI_ACHAT_NTC_NTC v WHERE v.ntc=ntcD")
   // List<AchatDirect> findByFullNameLike(String ntcD);

    List<AchatDirect> findByNtc(String ntc);


    //  List<AchatDirect> findByFullNameLike(String ntc);

 //   @Query("SELECT v.ur,v.numPc,v.dtReal,v.montant FROM V_SUIVI_ACHAT_NTC_NTC v WHERE v.ntc=ntcD")
   // List<AchatDirect>  chercherParNtc(@Param("ntcD") int ntc);
}
