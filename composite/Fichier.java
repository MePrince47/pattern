import java.util.List;

public class Fichier implements Repertoire {
    private String nom;
    private String type;

    public Fichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    @Override
    public void decrire() {
        System.out.println("Fichier: " + nom + "." + type);
    }

    @Override
    public void ajouter(Repertoire repertoire) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void supprimer(Repertoire repertoire) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Repertoire> getEnfants() {
        return null;
    }
}
