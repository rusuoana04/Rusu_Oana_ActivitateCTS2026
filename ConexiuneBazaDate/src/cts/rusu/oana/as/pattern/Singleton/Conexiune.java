package cts.rusu.oana.as.pattern.Singleton;

public class Conexiune {
    private static Conexiune instance;

    public Conexiune() {
        System.out.println("Conexiune creata");
    }

    public static Conexiune getInstance()
    {
        if(instance==null)
        {
            instance=new Conexiune();
        }
        return instance;
    }



}
