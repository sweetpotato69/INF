public class Facture {


    //VARIABLES D'INSTANCES
    private Produit[] produitsList = new Produit[30];
    private int produitIndex = 0;


    void ajouterProduit(Produit produit) {

        produitsList[produitIndex++] = produit;

    }

    public double prixTotal() {

        double total = 0;
        for (int i = 0; i < produitIndex; i++) {
            total = produitsList[i].getPrix();

        }
        return total;
    }
}
