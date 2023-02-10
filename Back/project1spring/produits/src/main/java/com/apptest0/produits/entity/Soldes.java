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
@Table(name = "V_SOLDE")
public class Soldes implements Serializable {
    @Id
    @Column(name = "cod_caisse")
    private String codCaisse;

    @Column(name = "lib_caisse")
    private String libCaisse;

    @Column(name = "solde")
    private String solde;

    public String getCodCaisse() {
        return codCaisse;
    }

    public void setCodCaisse(String codCaisse) {
        this.codCaisse = codCaisse;
    }

    public String getLibCaisse() {
        return libCaisse;
    }

    public void setLibCaisse(String libCaisse) {
        this.libCaisse = libCaisse;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String libCaisse) {
        this.solde = solde;
    }




}

