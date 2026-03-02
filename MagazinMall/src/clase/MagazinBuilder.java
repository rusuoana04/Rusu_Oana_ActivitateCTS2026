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



    public MagazinBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
        return this;
    }

    public MagazinBuilder setTipPodea(String tipPodea) {
        this.tipPodea = tipPodea;
        return this;
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
