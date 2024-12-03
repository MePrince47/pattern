import java.util.List;

public interface Repertoire {
    void decrire();

    void ajouter(Repertoire element);

    void supprimer(Repertoire element);

    List<Repertoire> getEnfants();
}
