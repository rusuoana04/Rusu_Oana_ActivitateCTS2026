public class Client implements ICont{
    private String nume;
    private String adresa;
    private String nrTelefon;
    private String mail;


    public Client(String nume, String adresa, String nrTelefon, String mail) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
        this.mail = mail;

    }



    @Override
    public void descriereCont(DetaliiCont detaliiCont) {
        System.out.println("Clientul cu numele: "+nume+", adresa: "
                + adresa+",nr telefon: "+ nrTelefon+ ", mail: "+ mail
                + ", are contul cu nr cont: "+detaliiCont.getNrCont()+",suma in lei: "
                + detaliiCont.getSuma()+ ", la banca: "+ detaliiCont.getNumeBanca()+", sucursala: "
                +detaliiCont.getSucursala()+ ", capital: "+ detaliiCont.getCapital());
    }
}
