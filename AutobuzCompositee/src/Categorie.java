import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{
    String nume;
    List<Optiune> lista;


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
    public void descriere() throws Exception {
        System.out.println("Sectie: "+ nume);
        for(Optiune optiune:lista)
        {
            optiune.descriere();
        }
    }
}
