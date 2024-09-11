
abstract class produitA {
    public abstract void methodeA();
}

class produitA1 extends produitA {
    public void methodeA() {
        System.out.println("je suis le ProduitA1");
    }
}

class produitA2 extends produitA {
    public void methodeA() {
        System.out.println("je suis le ProduitA2");
    }
}

/** Fabrique */

abstract class produitFactory {
    protected abstract produitA createproduit();
    public produitA getProduitA(){
        return createproduit();
    }
}

class produitFactory1 extends produitFactory 
{
    protected produitA createproduit(){
        produitA produit = new produitA1();
        return produit;
    }
}

class produitFactory2 extends produitFactory 
{
    protected produitA createproduit(){
        produitA produit = new produitA2();
        return produit;
    }
}

/* Client  */
public class client {
    public static void main(String[] args){

        produitFactory pf1 = new produitFactory1();
        produitA p1 = pf1.createproduit();
        p1.methodeA();

        produitFactory pf2 = new produitFactory2();
        produitA p2 = pf2.createproduit();
        p2.methodeA();


    }
}
/*
echo "# pattern projet" >> README.md
git init
git add projet.java
git commit -m "projet.java"
git branch -M main
git remote add origin https://github.com/MePrince47/pattern.git
git push -u origin main

Dans une nouvelle branche 

git checkout -b EWONDJO  # Créer et changer de branche
git add client.java
git commit -m "Ajout du fichier client.java dans la nouvelle branche"
git push -u origin EWONDJO


*/