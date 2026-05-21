package model;

public class Personne {
    private int numMatricule;
    private String nom;
    private String prenom;
    private int age;
    private String mail;
    private String motDePass;
    private char role;

    // Constructeur par défaut
    public Personne() {
    }

    // Constructeur complet
    public Personne(int numMatricule, String nom, String prenom, int age, String mail, String motDePass, char role) {
        this.numMatricule = numMatricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.mail = mail;
        this.motDePass = motDePass;
        this.role = role;
    }

    // Getters et Setters
    public int getNumMatricule() {
        return numMatricule;
    }

    public void setNumMatricule(int numMatricule) {
        this.numMatricule = numMatricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }
    public char getRole() {
        return role;
    }

    public void setRole(char role) {
        this.role = role;
    }
    
    @Override
    public String toString(){
       return this.nom + " " + this.prenom;  
    }
    
    
}
