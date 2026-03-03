public class Factory {
    public IMedicament creareMedicament(TipMedicament tipMedicament, String denumire, float pret) throws Exception {



        switch (tipMedicament)
        {
            case Raceala:

                return new MedicamentRaceala(denumire, pret);
            case Durere:
                return  new MedicamentDurere(denumire, pret);
            case Body:
                return new MedicamentBody(denumire,pret);
            default:
                throw new Exception("Eroare");

        }
    }
}
