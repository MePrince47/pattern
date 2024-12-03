public class Rectangle {
    private int largeur;
    private int Longueur;

    public Rectangle(int largeur, int Longueur) {
        this.largeur = largeur;
        this.Longueur = Longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return Longueur;
    }

    public int calculerPerimetreRec() {
        return 2 * (largeur + Longueur);
    }

    public int calculerAireRec() {
        return largeur * Longueur;
    }
}
