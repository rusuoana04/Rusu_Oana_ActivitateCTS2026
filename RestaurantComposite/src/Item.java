public class Item implements  Optiune{
     String tip;
     String nume;

    public Item(String tip, String nume) {
        this.tip = tip;
        this.nume = nume;
    }

    @Override
    public void adaugareNod(Optiune optiune) throws Exception {
        throw new Exception("Nu s-a intitializat");
    }

    @Override
    public void stergereNod(Optiune optiune) throws Exception {
        throw new Exception("Nu s-a intitializat");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("Nu s-a intitializat");
    }

    @Override
    public void descriere() {
        System.out.println(tip+" "+nume);
    }

    @Override
    public String toString() {
        return  tip +" " + nume;

    }
}
