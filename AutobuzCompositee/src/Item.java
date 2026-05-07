public class Item implements Optiune{
    String nume;
    String producator;
    String model;
    int nrLocuri;

    public Item(String nume, String producator, String model, int nrLocuri) {
        this.nume = nume;
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void adaugareNod(Optiune optiune) throws Exception {
        throw new Exception("Nu s-a implementat");
    }

    @Override
    public void stergereNod(Optiune optiune) throws Exception {
        throw new Exception("Nu s-a implementat");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("Nu s-a implementat");
    }

    @Override
    public void descriere() throws Exception {
        System.out.println("Item:"+nume+ ", producator: "+producator+", model:"+ ", nrLocuri: "+nrLocuri);
    }
}
