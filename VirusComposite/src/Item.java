public class Item implements Optiune{
    private String nume;
    private int nrCazuri;


    public Item(String nume, int nrCazuri) {
        this.nume = nume;
        this.nrCazuri = nrCazuri;

    }

    @Override
    public void adaugareNod(Optiune optiune) throws Exception {
        throw new Exception("Neimplementat");
    }

    @Override
    public void stergereNod(Optiune optiune) throws Exception {
        throw new Exception("Neimplementat");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("Neimplementat");
    }

    @Override
    public void descriere() {
        System.out.println("Item-Tara: "+nume+" nr cazuri: "+ nrCazuri);
    }
}
