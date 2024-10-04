
//produit

abstract class produitA { // Notre classe abstraite
    public abstract void methodeA(); // Notre methode abstraite
}

// Produit issu de la classe mère
class produitA1 extends produitA {
    public void methodeA() {
        System.out.println("-> Je suis la methodA1 du produit A1 -");
    }
}

// Produit issu de la classe mère
class produitA2 extends produitA {
    public void methodeA() {
        System.out.println("-> Je suis la methodA2 du produit A2 -");
    }
}

// Produit issu de la classe mère
class produitA3 extends produitA {
    public void methodeA() {
        System.out.println("-> Je suis la methodA3 du produit A3 -");
    }
}

// Créons les fabriques

abstract class fabrique {
    public abstract produitA createproduit();
}

class fabrique1 extends fabrique {
    public produitA createproduit() {
        return new produitA1();
    }
}

class fabrique2 extends fabrique {
    public produitA createproduit() {
        return new produitA2();
    }
}

class fabrique3 extends fabrique {
    public produitA createproduit() {
        return new produitA3();
    }
}

// Client
public class factorydev1 {
    public static void main(String[] args) {

        // Nos fabriques
        fabrique f1 = new fabrique1();
        fabrique f2 = new fabrique2();
        fabrique f3 = new fabrique3();

        // Nos objets via les fabriques
        produitA p1 = null;
        produitA p2 = null;
        produitA p3 = null;

        p1 = f1.createproduit();
        p2 = f2.createproduit();
        p3 = f3.createproduit();
        p1.methodeA();
        p2.methodeA();
        p3.methodeA();

    }

}

/*
 * echo "# pattern Singleton" >> README.md
 * git init
 * git add Singleton.java
 * git commit -m "Singleton.java"
 * git branch -M main
 * git remote add origin https://github.com/MePrince47/pattern.git
 * git push -u origin main
 * 
 * echo "# INF4067" >> README.md
 * git init
 * git add README.md
 * git commit -m "cours/factorydev1"
 * git branch -M main
 * git remote add origin https://github.com/MePrince47/INF4067.git
 * git push -u origin
 * 
 */