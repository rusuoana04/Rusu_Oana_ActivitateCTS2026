import java.util.HashMap;

public class FabricaDeClienti {
    private HashMap<String,ICont> clienti;

    public FabricaDeClienti() {
        clienti=new HashMap<>();
    }
    public int getNrClienti()
    {
        return clienti.size();
    }

    public ICont getClient(String nume, String adresa, String nrTelefon, String mail )
    {
        String key=nume+adresa+nrTelefon+mail;
        ICont client=clienti.get(key);
        if(client==null)
        {
            client=new Client(nume,adresa,nrTelefon,mail);
            clienti.put(key,client);
        }
        return client;
    }
}
