import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{
    private List<Optiune> lista;

    private String nume;

    public Categorie(String nume) {

        this.nume = nume;
        lista=new ArrayList<Optiune>();
    }



    @Override
    public void adaugareNod(Optiune optiune) throws Exception {
        lista.add(optiune);
    }

    @Override
    public void stergereNod(Optiune optiune) throws Exception {
        lista.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sectie "+nume);
        for(Optiune optiune: lista)
        {
            optiune.descriere();
        }
    }

    @Override
    public String toString() {
        return "Sectie "+ nume;
    }
}
