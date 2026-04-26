public class MedicamentAdapter extends MedicamenteFarmacie{
    private MedicamenteDepozit medicamenteDepozit;
    private  int id;



    public MedicamentAdapter( MedicamenteDepozit medicamenteDepozit) {
        super();
        this.medicamenteDepozit = medicamenteDepozit;
    }

    @Override
    public void setareMedicament(int id) {
        super.setareMedicament(id);
    }

    @Override
    public boolean verificareDisponibilitate(int nr) {
        return medicamenteDepozit.verificăStocPentruMedicament(id,nr);
    }
}
