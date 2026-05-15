import java.util.ArrayList;
import java.util.List;

public class Subcategorie implements Optiune{
    String nume;
    List<Optiune> lista;

    public Subcategorie(String nume) {
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
        System.out.println("Sectie: Cutie : "+nume);
        for (Optiune optiune:lista)
        {
            optiune.descriere();
        }
    }
}
