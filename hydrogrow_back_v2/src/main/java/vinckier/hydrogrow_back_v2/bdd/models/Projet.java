package vinckier.hydrogrow_back_v2.bdd.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjet;
    private String nomProjet;
    private String description;
    private Date dateCreation;

    // Constructeurs
    public Projet() {
    }

    public Projet(Long idProjet, String nomProjet, String description, Date dateCreation) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.description = description;
        this.dateCreation = dateCreation;
    }

    // Getters and Setters
    public Long getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}