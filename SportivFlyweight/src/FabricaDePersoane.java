import java.util.HashMap;

public class FabricaDePersoane {
    private HashMap<Double, ITribuna> persoane;

    public FabricaDePersoane() {
        persoane=new HashMap<>();

    }

    public int getNrPersoane()
    {
     return persoane.size();
    }

    public ITribuna getPersoana(double inaltime, double latime)
    {
         Double key=inaltime+latime;
         ITribuna persoana=persoane.get(key);
         if(persoana==null)
         {
             persoana=new Persoana(inaltime,latime);
             persoane.put(key,persoana);
         }
         return persoana;
    }
}
