import java.util.HashMap;

public class FabricaDeAutobuze {
    private HashMap<Integer, ILinie> linii;

    public FabricaDeAutobuze() {
        linii=new HashMap<>();
    }

    public int getNrLinii()
    {
        return linii.size();
    }

    public ILinie getLinie(int nrLinie, String primaStatie, String ultimaStatie)
    {
        int key=nrLinie;
        ILinie linie=linii.get(key);
        if(linie==null)
        {
            linie=new Linie(nrLinie,primaStatie,ultimaStatie);
            linii.put(key,linie);

        }
        return  linie;
    }
}
