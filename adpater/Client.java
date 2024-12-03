public class Client {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 6); // Carré déguisé en rectangle
        Carre carreAdapter = new AdaptateurRectangle(rect);

        System.out.println("Perimetre : " + carreAdapter.calculerPerimetre());
        System.out.println("Aire : " + carreAdapter.calculerAire());
    }
}
