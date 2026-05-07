public class Pacient implements  IInternare{
    private String nume;
    private String telefon;
    private String adresa;

    public Pacient(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }



    @Override
    public void descriereInternare(DetaliiInternare detaliiInternare) {
        System.out.println("Pacientul "+ nume+ ", telefon: "+telefon+ ", adresa: "+adresa+ ", este internat in salonul: "+ detaliiInternare.getNrSalon()+ ", pat: "+detaliiInternare.getNrPat()+", zile: "+ detaliiInternare.getNrZile());
    }
}
