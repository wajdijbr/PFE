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
@Table(name = "V_SUIVI_AVANCES_2")
public class Avances implements Serializable {






    @Column(name = "ntx")
    private String ntx;

    @Column(name = "ntc")
    private String ntc;
    @Id
    @Column(name = "libelle")
    private String libelle;

    @Column(name = "total")
    private String total;


    public String getMontant() {
        return total;
    }

    public void setMontant(String montant) {
        this.total = total;
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

