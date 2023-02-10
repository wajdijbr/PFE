package com.apptest0.produits.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "v_journal_par_jours")
public class Caisse implements Serializable {
    @Id


    @Column(name = "lib_caisse")
    private String libCaisse;

    @Column(name = "date_journee")
    private String dateJournee;

    @Column(name = "solde_veille")
    private String soldeVeille;




    public String getLibCaisse() {
        return libCaisse;
    }

    public void setLibCaisse(String libCaisse) {
        this.libCaisse = libCaisse;
    }

    public String getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(String dateJournee) {
        this.dateJournee = dateJournee;
    }

    public String getSoldeVeille() {
        return soldeVeille;
    }

    public void setSoldeVeille(String soldeVeille) {
        this.soldeVeille = soldeVeille;
    }




}

