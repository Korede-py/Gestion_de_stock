package model;

public class Produit {
    private int codeProduit;
    private String nom;
    private int quantitStock;
    private double prixUnitaire; // Changé en double pour gérer les prix avec centimes
    private int seuilAlert;

    // Constructeur par défaut
    public Produit() {
    }

    // Constructeur complet
    public Produit(int codeProduit, String nom, int quantitStock, double prixUnitaire, int seuilAlert) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.quantitStock = quantitStock;
        this.prixUnitaire = prixUnitaire;
        this.seuilAlert = seuilAlert;
    }

    // Getters et Setters
    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitStock() {
        return quantitStock;
    }

    public void setQuantitStock(int quantitStock) {
        this.quantitStock = quantitStock;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getSeuilAlert() {
        return seuilAlert;
    }

    public void setSeuilAlert(int seuilAlert) {
        this.seuilAlert = seuilAlert;
    }
}
