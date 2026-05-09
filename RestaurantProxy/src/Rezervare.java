public class Rezervare implements IRezervare {
    private Client client;

    public Rezervare(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void descriere() {
        System.out.println("Rezervare disponibila pentru 4 persoane minim");
    }

    @Override
    public void realizareRezervare() {
        System.out.println("S-a rezalizat o rezervare pentru clientul: "+ client.getNume()+" pentru "+ client.getNrPersoane()+ " persoane");
    }
}
