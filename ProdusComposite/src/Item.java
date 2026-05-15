public class Item implements Optiune{
    private String  nume;
    private int cantitate;
    private double pret;

    public Item(String nume, int cantitate, double pret) {
        this.nume = nume;
        this.cantitate=cantitate;
        this.pret = pret;
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
        double tva=this.pret-(this.pret/(1+((double) 21 /100)));
        System.out.println("Item Produs: "+nume+" cantitate: "+cantitate+" pret: " +pret+ " TVA "+ tva );
    }

}
