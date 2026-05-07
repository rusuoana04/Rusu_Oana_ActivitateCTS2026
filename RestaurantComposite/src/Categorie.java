import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{
    List<Optiune> lista;
    String tip;
    String nume;

    public Categorie(String tip, String nume) {
        this.tip = tip;
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
        System.out.println(tip+ " "+nume);
        for(Optiune optiune: lista)
        {
            optiune.descriere();
        }
    }

    @Override
    public String toString() {
        return  tip +" " + nume;
    }
}
