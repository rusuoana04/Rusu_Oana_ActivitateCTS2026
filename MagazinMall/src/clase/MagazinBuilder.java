package clase;

public class MagazinBuilder implements Builder{
    String denumire;
    float suprafata;
    int nrIntrari=1;
    String tipPodea="standard";

    public MagazinBuilder(String denumire, float suprafata) {
        this.denumire = denumire;
        this.suprafata = suprafata;

    }



    public void setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
    }

    public void setTipPodea(String tipPodea) {
        this.tipPodea = tipPodea;
    }

    @Override
    public Magazin build() throws Exception {
        if(nrIntrari<suprafata/100)
        {
           throw  new Exception("Prea putine intrari");
        }

        return new Magazin(this);
    }
}
