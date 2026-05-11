public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Stimate client, "+nume+" ati primit urmatorul mesaj de la :  "+ mesaj);
    }
}
