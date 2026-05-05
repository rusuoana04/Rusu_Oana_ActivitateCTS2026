import java.util.ArrayList;
import java.util.List;

public class MasaLibera {
    private int nrMasa;
    private List<Integer> NrMese=new ArrayList<>();

    public MasaLibera(int nrMasa) {
        this.nrMasa = nrMasa;
       NrMese.add(1);
       NrMese.add(2);
       NrMese.add(5);
    }

    public boolean verificareMasaLibera()
    {
        if(NrMese.contains(nrMasa))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
