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
@Table(name = "V_SUIVI_ACHAT_2")
public class AchatsD implements Serializable {



    @Column(name = "libelle")
    private String libelle;


    @Column(name = "total")
    private String total;
    @Id
    @Column(name = "ntc")
    private String ntc;
    @Column(name = "ntx")
    private String ntx;







    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNtc() {
        return ntc;
    }

    public void setNtc(String ntc) {
        this.ntc = ntc;
    }

    public String getNtx() {
        return ntx;
    }

    public void setNtx(String ntx) {
        this.ntx = ntx;
    }







}

