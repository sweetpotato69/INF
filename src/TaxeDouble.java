public class TaxeDouble {

    //VARIABLES D'INSTANCES
    private String nom;
    private double prix;

    //CONSTRUCTEURS
    public TaxeDouble(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double getPrix() {
        prix = prix * 1.09975;
        return prix;
    }
}
