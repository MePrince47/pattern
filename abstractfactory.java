//ProduitA

 abstract class produitA{
    public abstract void methodeA();
}

class produitA1 extends produitA{
    public void methodeA(){
        System.out.println("Je suis A1");
    }
}
class produitA2 extends produitA{
    public void methodeA(){
        System.out.println("Je suis A2");
    }
}

// PRODuit B
 abstract class produitB{
    public abstract void methodeA();
}

class produitB1 extends produitB{
    public void methodeA(){
        System.out.println("Je suis B1");
    }
}
class produitB2 extends produitB{
    public void methodeA(){
        System.out.println("Je suis B2");
    }
}


// fabrique

interface fabriqueAbstraite {
    public abstract produitA createproduitA();
    public abstract produitB createproduitB();
}

class fabriqueconcrete1 implements fabriqueAbstraite {
    public produitA createproduitA()
    {
        produitA produit = new produitA1();
        return produit;
    }
    public produitB createproduitB()
    {
        produitB produit = new produitB1();
        return produit;
    }
}

class fabriqueconcrete2 implements fabriqueAbstraite {
    public produitA createproduitA()
    {
        produitA produit = new produitA2();
        return produit;
    }
    public produitB createproduitB()
    {
        produitB produit = new produitB2();
        return produit;
    }
}



//client 
public class abstractfactory{
    public static void main (String[] args)
    {

        // Fabrique 1 

        fabriqueAbstraite FA1 = new fabriqueconcrete1();
        produitA p1 = FA1.createproduitA();
        p1.methodeA();


        fabriqueAbstraite FA11 = new fabriqueconcrete1();
        produitB p11 = FA11.createproduitB();
        p11.methodeA();

        // Fabrique 2 

        fabriqueAbstraite FA2 = new fabriqueconcrete2();
        produitA p2 = FA2.createproduitA();
        p2.methodeA();

        fabriqueAbstraite FA21 = new fabriqueconcrete2();
        produitB p21 = FA21.createproduitB();
        p21.methodeA();
    }
}