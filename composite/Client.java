public class Client {
    public static void main(String[] args) {
        Repertoire fichier1 = new Fichier("doc1", "txt");
        Repertoire fichier2 = new Fichier("doc2", "pdf");
        Repertoire repertoire1 = new SousRepertoire("dossier1");

        repertoire1.ajouter(fichier1);
        repertoire1.ajouter(fichier2);

        Repertoire repertoire2 = new SousRepertoire("dossier2");
        Repertoire fichier3 = new Fichier("doc3", "pdf");
        repertoire2.ajouter(fichier3);
        repertoire2.ajouter(repertoire1); // dossier1 dans dossier2

        repertoire2.decrire();
    }
}
