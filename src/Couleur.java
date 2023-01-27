public class Couleur {

//VARIABLES D'INSTANCES
    private int rouge ;
    private int vert;
    private int bleu;

//CONSTRUCTEURS
    public Couleur(int rouge, int vert, int bleu) {
        if (rouge >= 0 && rouge <= 255){
            this.rouge = rouge;
        }
        else System.out.println("Erreur constructeur rouge");
        if (vert >= 0 && vert <= 255) {
            this.vert = vert;
        }
        else System.out.println("Erreur constructeur vert");
        if (bleu >= 0 && bleu <= 255) {
            this.bleu = bleu;
        }
        else System.out.println("Erreur constructeur bleu");
    }
//GETTERS & SETTERS
    public int getRouge() {
        return rouge;
    }

    public void setRouge(int rouge) {
        if (rouge >= 0 && rouge <= 255) {
            this.rouge = rouge;
        }
        else System.out.println("Erreur setter rouge");
    }

    public int getVert() {
        return vert;
    }

    public void setVert(int vert) {
        if (vert >= 0 && vert <= 255) {
            this.vert = vert;
        }
        else System.out.println("Erreur setter vert");
    }

    public int getBleu() {
        return bleu;
    }

    public void setBleu(int bleu) {
        if (bleu >= 0 && bleu <= 255) {
            this.bleu = bleu;
        }
        else System.out.println("Erreur setter bleu");
    }

//TOSTRING
    @Override
    public String toString() {
        return "Couleur{" +
                "rouge=" + rouge +
                ", vert=" + vert +
                ", bleu=" + bleu +
                '}';
    }
//METHODE BLANCHIR
    public void blanchir() {
        rouge = (rouge + 255) / 2;
        vert = (vert + 255) / 2;
        bleu = (bleu + 255) / 2;

    }

}


