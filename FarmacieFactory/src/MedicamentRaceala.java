public class MedicamentRaceala extends Medicament{


    public MedicamentRaceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Medicament tratare raceala");
    }
}
