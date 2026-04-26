public class MedicamentAdapter extends  MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public MedicamentAdapter(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumpărăMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
