public class MedicamentDurere extends Medicament{

    public MedicamentDurere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Medicament tratare durere");
    }
}
