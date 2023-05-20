package vinckier.hydrogrow_back_v2.bdd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idUser;
    private String nom;
    private String email;
    private String mdp;

    // Constructeurs
    public User() {
    }

    public User(String idUser, String nom, String email, String mdp) {
        this.idUser = idUser;
        this.nom = nom;
        this.email = email;
        this.mdp = mdp;
    }

    // Getters and Setters
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String string) {
        this.idUser = string;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}