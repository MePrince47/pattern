import java.util.ArrayList;
import java.util.List;

public class SousRepertoire implements Repertoire {
    private String nom;
    private List<Repertoire> enfants = new ArrayList<>();

    public SousRepertoire(String nom) {
        this.nom = nom;
    }

    @Override
    public void decrire() {
        System.out.println("Repertoire: " + nom);
        for (Repertoire e : enfants) {
            e.decrire();
        }
    }

    @Override
    public void ajouter(Repertoire repertoire) {
        enfants.add(repertoire);
    }

    @Override
    public void supprimer(Repertoire repertoire) {
        enfants.remove(repertoire);
    }

    @Override
    public List<Repertoire> getEnfants() {
        return enfants;
    }
}
