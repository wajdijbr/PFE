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
@Table(name = "V_SUIVI_ACHAT_NTC_NTC")
public class AchatDirect implements Serializable {

    @Id
    @Column(name = "ur")
    private String ur;
    @Column(name = "num_pc")
    private String numPc;

    @Column(name = "dt_real")
    private String dtReal;

    @Column(name = "montant")
    private String montant;

    @Column(name = "ntx")
    private String ntx;

    @Column(name = "ntc")
    private String ntc;

    @Column(name = "libelle")
    private String libelle;

    public String getUr() {
        return ur;
    }

    public void setUr(String ur) {
        this.ur = ur;
    }

    public String getNumPc() {
        return numPc;
    }

    public void setNumPc(String numPc) {
        this.numPc = numPc;
    }


    public String getDtReal() {
        return dtReal;
    }

    public void setDtReal(String dtReal) {
        this.dtReal = dtReal;
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

