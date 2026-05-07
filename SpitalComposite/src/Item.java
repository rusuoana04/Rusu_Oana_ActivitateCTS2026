

public class Item implements Optiune{

    private String nume;

    public Item( String nume) {

        this.nume = nume;
    }

    @Override
    public void adaugareNod(Optiune optiune) throws Exception {
        throw new Exception("Nu s-a initializat");
    }

    @Override
    public void stergereNod(Optiune optiune) throws Exception {
        throw new Exception("Nu s-a initializat");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw  new Exception("Nu s-a initializat");
    }

    @Override
    public void descriere() {
        System.out.println("Subsectie "+nume);
    }

    @Override
    public String toString() {
        return "Subsectie"+ nume;

    }
}
