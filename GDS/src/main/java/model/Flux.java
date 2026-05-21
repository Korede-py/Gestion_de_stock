package model;
import java.time.LocalDateTime;
public class Flux {
    private int idFlux;
    private String typeFlux; // Exemple: "ENTREE" ou "SORTIE"
    private LocalDateTime dateFlux;   // Utilisation du type Date officiel de Java
    private int quantite;    // Changé en int pour permettre les calculs mathématiques
    
    // Liens issus de vos flèches relationnelles
    private Personne personne; // La personne qui a enregistré le flux
    private Produit produit;   // Le produit concerné par le flux

    // Constructeur par défaut
    public Flux() {
    }

    // Constructeur complet
    public Flux(int idFlux, String typeFlux, LocalDateTime dateFlux, int quantite, Personne personne, Produit produit) {
        this.idFlux = idFlux;
        this.typeFlux = typeFlux;
        this.dateFlux = dateFlux;
        this.quantite = quantite;
        this.personne = personne;
        this.produit = produit;
    }

    // Getters et Setters
    public int getIdFlux() {
        return idFlux;
    }

    public void setIdFlux(int idFlux) {
        this.idFlux = idFlux;
    }

    public String getTypeFlux() {
        return typeFlux;
    }

    public void setTypeFlux(String typeFlux) {
        this.typeFlux = typeFlux;
    }

    public LocalDateTime getDateFlux() {
        return dateFlux;
    }

    public void setDateFlux(LocalDateTime dateFlux) {
        this.dateFlux = dateFlux;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    @Override
    public String toString(){
        return "Fiche n° " + idFlux + "\n Fait par M/Mme " + personne.toString() ;   
     }
}
