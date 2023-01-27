public class TaxeSimple extends Produit {

    //VARIABLES D'INSTANCES
    private String nom;
    private double prix;

    //CONSTRUCTEUR

    public TaxeSimple(String nom, double prix) {
        super(nom, prix);
        this.nom = nom;
        this.prix = prix;
    }

    public double getPrix() {
        prix = prix * 1.05;
        return prix;
    }
}