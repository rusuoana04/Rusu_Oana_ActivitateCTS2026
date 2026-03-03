public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        IMedicament medicament;
        try {
            medicament=factory.creareMedicament(TipMedicament.Raceala, "medicament1", 100);
            medicament.descriere();
            System.out.println(medicament);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}