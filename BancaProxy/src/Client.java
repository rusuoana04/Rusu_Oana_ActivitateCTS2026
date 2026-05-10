public class Client {
    private String numeClient;
    private boolean contRon;

    public Client(String numeClient, boolean contRon) {
        this.numeClient = numeClient;
        this.contRon = contRon;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public boolean isContRon() {
        return contRon;
    }

    public void setContRon(boolean contRon) {
        this.contRon = contRon;
    }


}
