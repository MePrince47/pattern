
 final class MSingleton {
    private static MSingleton instance = null;

    private int x;
    private int y;

    private MSingleton()
    {
        super();
    }

    private MSingleton (int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public static MSingleton getInstance ()
    {
        if (instance == null)
        {
            instance = new MSingleton();
        }
        return instance;
    }

    public static MSingleton getInstance(int x,int y)
    {
        if (instance == null)
        {
            instance = new MSingleton(x,y);
        }
        return instance;
    }

    public int somme(int x,int y){
        return x+y;
    }

    public float moyenne(int x , int y)
    {
        return somme(x,y)/2;
    }

    public void affiche()
    {
        System.out.println("\n je suis une instance mes valeurs sont : x = "+this.x+" et y = "+this.y);
    }

    @Override 
    public Object clone() throws
    CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}

public class Singleton{
    public static void main (String[] args)
    {
        int som = MSingleton.getInstance().somme(2,5);
        System.out.printf("La somme est : %d",som);

        MSingleton s1 = MSingleton.getInstance(8, 3);
        s1.affiche();
        MSingleton s2= MSingleton.getInstance(5, 9);
        s2.affiche();

            }
}

/*
echo "# pattern Singleton" >> README.md
git init
git add Singleton.java
git commit -m "projet.java"
git branch -M main
git remote add origin https://github.com/MePrince47/pattern.git
git push -u origin main

*/