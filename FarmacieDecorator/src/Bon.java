public  class Bon implements IBon {
private int nrBon;
private float suma;

    public Bon(int nrBon, float suma) {
        this.nrBon = nrBon;
        this.suma = suma;
    }

    @Override
    public void printeazaBon() {
        System.out.println("S-a printat bonul cu nr: "+nrBon+ " cu suma: "+suma);
    }
}
