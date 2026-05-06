public class Nota implements INota{
    private int nrBon;
    private float suma;

    public Nota(int nrBon, float suma) {
        this.nrBon = nrBon;
        this.suma = suma;
    }

    @Override
    public void printezaNota() {
        System.out.println("S-a printat nota de plata cu nr bon: "+ nrBon+ ", in valoare de: "+suma);
    }
}
