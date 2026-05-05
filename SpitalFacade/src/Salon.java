import java.util.ArrayList;
import java.util.List;

public class Salon {
    private int nrPat;
    private List<Integer> paturiLibere=new ArrayList<>();
    private List<Integer> paturiOcupate=new ArrayList<>();

    public Salon(int nrPat) {
        this.nrPat = nrPat;
        paturiLibere.add(1);
        paturiLibere.add(3);
        paturiOcupate.add(2);
        paturiOcupate.add(4);
    }

    public boolean verificaPat()
    {
        if(paturiLibere.contains(nrPat))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
