public class MedicamentBody extends Medicament{


    public MedicamentBody(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Medicament tratare body");
    }
}
