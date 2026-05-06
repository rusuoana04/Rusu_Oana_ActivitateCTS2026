public class Bilet implements IBilet{
    private int nrBilet;
    private float pret;

    public Bilet(int nrBilet, float pret) {
        this.nrBilet = nrBilet;
        this.pret = pret;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("S-a achizitionat biletul cu nr: "+ nrBilet+ ", cu pretul: "+pret);
    }


}
