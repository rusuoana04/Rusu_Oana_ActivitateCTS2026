import java.util.HashMap;

public class FabricaDeClienti {
    private HashMap<String, IReteta> clienti;

    public FabricaDeClienti() {
        clienti=new HashMap<>();
    }

    public int getNrClienti()
    {
        return clienti.size();
    }

    public IReteta getClient(String nume, String nrAsigurare)
    {
        String key=nume+nrAsigurare;
        IReteta client=clienti.get(key);
        if(client==null)
        {
            client=new Client(nume, nrAsigurare);
            clienti.put(key,client);
        }
        return client;
    }
}
