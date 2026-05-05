import java.util.ArrayList;
import java.util.List;

public class MasaServetele {
    private int nrMasa;
    private List<Integer> nrMese=new ArrayList<>();

    public MasaServetele(int nrMasa) {
        this.nrMasa = nrMasa;
        nrMese.add(1);
        nrMese.add(2);
    }

    public boolean verificaServeteleMasa()
    {
        if(nrMese.contains(nrMasa))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
