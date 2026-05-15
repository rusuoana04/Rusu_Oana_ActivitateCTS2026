import java.util.HashMap;

public class FabricaDeEvenimente {
    private HashMap<String, ITransmisiune> lista;

    public FabricaDeEvenimente() {
        lista=new HashMap<>();
    }

    public int getNrEvenimente()
    {
        return lista.size();
    }

    public ITransmisiune getEveniment(String nume, int durata)
    {
        String key=nume;
        ITransmisiune eveniment=lista.get(key);
        if(eveniment==null)
        {
            eveniment=new Eveniment(nume, durata);
            lista.put(key,eveniment);

        }
        return eveniment;
    }
}
