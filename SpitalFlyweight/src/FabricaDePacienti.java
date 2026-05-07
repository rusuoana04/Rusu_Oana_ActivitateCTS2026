import java.util.HashMap;

public class FabricaDePacienti {
    private HashMap<String, IInternare> pacienti;

    public FabricaDePacienti() {
        pacienti=new HashMap<>();
    }


    public  int getNrPacienti()
    {
        return pacienti.size();
    }
    public IInternare getPacient(String nume, String telefon, String adresa)
    {
        String key=nume+telefon+adresa;
        IInternare pacient=pacienti.get(key);
        if(pacient==null)
        {
            pacient=new Pacient(nume,telefon,adresa);
            pacienti.put(key,pacient);
        }
        return pacient;
    }

}
