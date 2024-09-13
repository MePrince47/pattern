package construction.singleton;

public final class Singleton {
    private static Singleton instance =null;

    private int x;
    private int y;

    private Singleton()
    {
        super();
    }

    private Singleton (int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public static Singleton getInstance ()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x,int y)
    {
        if (instance == null)
        {
            instance = new Singleton(x,y);
        }
        return instance;
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