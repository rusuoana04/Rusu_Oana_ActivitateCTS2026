public abstract class Medicament implements IMedicament{

    protected String denumire;
    protected float pret;

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
