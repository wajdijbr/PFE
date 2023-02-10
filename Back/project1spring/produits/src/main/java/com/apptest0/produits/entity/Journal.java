package com.apptest0.produits.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "V_JOURNAL")
public class Journal implements Serializable {
    @Id
    @Column(name = "caisse")
    private String codCaisse;

    @Column(name = "lib_caisse")
    private String libCaisse;

    @Column(name = "date_journee")
    private Date dateJournee;

    @Column(name = "etat_journee")
    private String etatJournee;

    @Column(name = "solde_debut")
    private String soldeDebut;

    @Column(name = "solde_veille")
    private String soldeVeille;

    @Column(name = "date_cloture")
    private Date dateCloture;

    @Column(name = "sejour")
    private String sejour;

    public String getCodCaisse() { return codCaisse; }

    public void setCodCaisse(String codCaisse) { this.codCaisse = codCaisse; }

    public String getLibCaisse() {
        return libCaisse;
    }

    public void setLibCaisse(String libCaisse) {
        this.libCaisse = libCaisse;
    }

    public Date getDateJournee() { return dateJournee; }

    public void setDateJournee(Date dateJournee) { this.dateJournee = dateJournee; }

    public String getEtatJournee() { return etatJournee; }

    public void setEtatJournee(String etatJournee) { this.etatJournee = etatJournee; }

    public String getSoldeDebut() { return soldeDebut; }

    public void setSoldeDebut(String soldeDebut) { this.soldeDebut = soldeDebut; }


    public String getSoldeVeille() { return soldeVeille; }

    public void setSoldeVeille(String soldeVeille) { this.soldeVeille = soldeVeille; }


    public Date getDateCloture() { return dateCloture; }

    public void setDateCloture(Date dateCloture) { this.dateCloture = dateCloture; }


    public String getSejour() { return sejour; }

    public void setSejour(String sejour) { this.sejour = sejour; }


}

