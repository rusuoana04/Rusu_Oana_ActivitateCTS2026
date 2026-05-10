public class Spectator {
    private String nume;
    private TipSpectator tipSpectator;

    public Spectator(String nume, TipSpectator tipSpectator) {
        this.nume = nume;
        this.tipSpectator = tipSpectator;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public TipSpectator getTipSpectator() {
        return tipSpectator;
    }

    public void setTipSpectator(TipSpectator tipSpectator) {
        this.tipSpectator = tipSpectator;
    }

    public void verificareSpectator(String nume)
    {
        tipSpectator.verificareSpectator(this.nume);
    }
}
