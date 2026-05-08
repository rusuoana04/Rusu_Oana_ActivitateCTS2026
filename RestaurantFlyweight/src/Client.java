public class Client implements IClient{
    private String nume;
    private String nrTelefon;
    private String mail;


    public Client(String nume, String nrTelefon, String mail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.mail = mail;
    }

    @Override
    public void descriereRezervare(DetaliiRezervare detaliiRezervare) {
        System.out.println("Clientul cu numele: "+nume+", telefon: "+nrTelefon+ ", mail: "+mail+ "a rezalizat o rezervare cu nr masa: "+ detaliiRezervare.getNrMasa()+ ", nr persoane: "+detaliiRezervare.getNrPersoanre()+ ", la ora: "+ detaliiRezervare.getOraRezervare());
    }
}
