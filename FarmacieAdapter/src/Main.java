public class Main {
    public static void main(String[] args) {

        MedicamenteDepozit medicamenteDepozit=new MedicamenteDepozit(1, 20);
        MedicamentAdapter medicamentAdapter=new MedicamentAdapter( medicamenteDepozit);
        medicamentAdapter.setareMedicament(1);
       boolean med= medicamentAdapter.verificareDisponibilitate(2);
       System.out.println("Medicamentul este in stoc? "+med);



    }
}