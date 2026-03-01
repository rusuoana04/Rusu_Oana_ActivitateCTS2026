public class Client implements IClient{
    private String numClient;
    private int nrPersoane;
    private float sumaCheltuita;

    public Client() {
    }

    public Client(String numClient, int nrPersoane, float sumaCheltuita) {

        this.numClient = numClient;
        this.nrPersoane = nrPersoane;
        this.sumaCheltuita = sumaCheltuita;
    }

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public float getSumaCheltuita() {
        return sumaCheltuita;
    }

    public void setSumaCheltuita(float sumaCheltuita) {
        this.sumaCheltuita = sumaCheltuita;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numClient='" + numClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", sumaCheltuita=" + sumaCheltuita +
                '}';
    }

    @Override
    public IClient copy() {
      Client copy=new Client();
      copy.numClient=this.numClient;
      copy.nrPersoane=this.nrPersoane;
      copy.sumaCheltuita=this.sumaCheltuita;
       return copy;

    }
}
