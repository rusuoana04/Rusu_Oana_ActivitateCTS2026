public class Credit implements ICredit{
    private Client client;

    public Credit(Client client) {
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
        System.out.println("Cont credit Ron");
    }

    @Override
    public void creareCont() {
        System.out.println("S-a solicitat crearea unui cont de credit pentru "+ client.getNumeClient());
    }
}
