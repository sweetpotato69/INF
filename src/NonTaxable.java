public class NonTaxable extends Produit {


    //VARIABLES D'INSTANCES
    private String nom;
    private double prix;

    //CONSTRUCTUER
    public NonTaxable(String nom, double prix) {
        super(nom, prix);
        this.nom = nom;
        this.prix = prix;
    }
    public double getPrix(){

        return prix;

    }


}