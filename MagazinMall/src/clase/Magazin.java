package clase;

public class Magazin {
    private final String denumire;
    private final float suprafata;
    private final int nrIntrari;
    private final String tipPodea;

    public Magazin(MagazinBuilder builder)
    {
        this.denumire=builder.denumire;
        this.suprafata=builder.suprafata;
        this.nrIntrari=builder.nrIntrari;
        this.tipPodea=builder.tipPodea;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", tipPodea=" + tipPodea +
                '}';
    }
}
