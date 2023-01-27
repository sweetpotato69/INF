public class Produit {

    //VARIABLES D'INSTANCES COMMUNES
    private String nom;
    private double prix;

    //CONSTRUCTEUR
    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    //GETTERS & SETTERS
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double prix(){
        return 0;
    }

    }
