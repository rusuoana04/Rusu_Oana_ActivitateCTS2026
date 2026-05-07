public class Item implements Optiune{
    String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugareNod(Optiune optiune) throws Exception {
        throw  new Exception("Nu s-a intitializat");
    }

    @Override
    public void stergereNod(Optiune optiune) throws Exception {
        throw  new Exception("Nu s-a intitializat");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw  new Exception("Nu s-a intitializat");
    }

    @Override
    public void descriere() {
        System.out.println("Subsectiune "+ nume);
    }

    @Override
    public String toString() {
        return "Subsectiune "+ nume;
    }
}
