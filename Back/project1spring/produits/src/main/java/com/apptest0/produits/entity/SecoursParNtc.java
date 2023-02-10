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
@Table(name = "V_SUIVI_SECOURS")
public class SecoursParNtc implements Serializable {

    @Id

    @Column(name = "num_pc")
    private String numPc;

    @Column(name = "mle_poste")
    private String mlePoste;

    @Column(name = "montant")
    private String montant;

    @Column(name = "ntx")
    private String ntx;

    @Column(name = "ntc")
    private String ntc;

    @Column(name = "libelle")
    private String libelle;



    public String getNumPc() {
        return numPc;
    }

    public void setNumPc(String numPc) {
        this.numPc = numPc;
    }


    public String getMlePoste() {
        return mlePoste;
    }

    public void setMlePoste(String dtReal) {
        this.mlePoste = mlePoste;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getNtx() {
        return ntx;
    }

    public void setNtx(String ntx) {
        this.ntx = ntx;
    }

    public String getNtc() {
        return ntc;
    }

    public void setNtc(String ntc) {
        this.ntc = ntc;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }



}

