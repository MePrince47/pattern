//factory Method 
/* _ */ 


// Produit A
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
        System.out.println("je suis A2");
    }
}

//Produit Factory
class produitFactory{
    public static final int typevalA1 = 1;
    public static final int typevalA2 = 2;

    
    
    public static produitA getProduitA(int typeval)
    {
        produitA produit = null;
        switch(typeval){
            case(typevalA1):
                produit = new produitA2();
                break;
            case(typevalA2):
                produit = new produitA2();
                break;
            default:
                throw new IllegalArgumentException("Valeur inconnue");
        }
        return produit;
    }


}
 class projet {


    public static void main(String[] args) {
        System.out.println("Hello, ok World!");

        produitFactory a = new produitFactory();
        produitA A1 = a.getProduitA(2);
        A1.methodeA();
    }


}
