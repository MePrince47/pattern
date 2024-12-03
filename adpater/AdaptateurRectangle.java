public class AdaptateurRectangle implements Carre {
    private Rectangle rectangle;

    public AdaptateurRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public int getCote() {
        // Je suppose que le carré a un côté égal à la largeur du rectangle
        return rectangle.getLargeur();
    }

    @Override
    public int calculerPerimetre() {
        return rectangle.calculerPerimetreRec();
    }

    @Override
    public int calculerAire() {
        return rectangle.calculerAireRec();
    }
}
