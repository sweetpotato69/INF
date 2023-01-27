public class Facture {


    //VARIABLES D'INSTANCES
    private NonTaxable[] nonTaxableList = new NonTaxable[10];
    private TaxeSimple[] taxeSimpleList = new TaxeSimple[10];
    private TaxeDouble[] taxeDoubleList = new TaxeDouble[10];
    private int nonTaxableIndex = 0;
    private int taxeSimpleIndex = 0;
    private int taxeDoubleIndex = 0;

    public void ajouterProduitNonTaxable (NonTaxable produit){
        
       nonTaxableList[nonTaxableIndex++] = produit;

    }

    public void ajouterProduitTaxeSimple (TaxeSimple produit){

        taxeSimpleList[nonTaxableIndex++] = produit;

    }

    public void ajouterProduitTaxeDouble (TaxeDouble produit ){

        taxeDoubleList[taxeDoubleIndex++] = produit;

    }
    public double prixTotal(){

        double total = 0;
        for (int i = 0; i < nonTaxableIndex;  i++){
            total = nonTaxableList[i].getPrix();
        }
        for(int i = 0; i < taxeSimpleIndex; i++){
            total= taxeSimpleList[i].getPrix();
        }
        for (int i = 0; i < taxeDoubleIndex; i++){
            total= taxeDoubleList[i].getPrix();
        }
        return total;
    }
}
