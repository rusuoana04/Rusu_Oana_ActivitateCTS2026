import java.util.ArrayList;
import java.util.List;

public class SubCategorie implements Optiune{
    String nume;
    List<Optiune> lista;

    public SubCategorie(String nume) {
        this.nume = nume;
        lista=new ArrayList<Optiune>();
    }

    @Override
    public void adaugareNod(Optiune optiune) {
        lista.add(optiune);
    }

    @Override
    public void stergereNod(Optiune optiune) {
        lista.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Subsectie: Virus "+ nume);
        for (Optiune optiune: lista)
        {
            optiune.descriere();
        }
    }
}
