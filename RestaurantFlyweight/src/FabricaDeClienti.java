import java.util.HashMap;

public class FabricaDeClienti {
  private HashMap<String, IClient> clienti;

    public FabricaDeClienti() {
        clienti=new HashMap<>();
    }
    public int getNrClienti()
    {
        return clienti.size();
    }

    public IClient getClient(String nume, String nrTelefon, String mail)
    {
        String key=nume+nrTelefon+mail;
        IClient client=clienti.get(key);
        if(client==null)
        {
            client=new Client(nume,nrTelefon,mail);
            clienti.put(key,client);
        }
        return client;
    }
}
