public class Main {
    public static void main(String[] args)
    {
        Client client=new Client("Ion", 2);
        Rezervare rezervare=new Rezervare(client);

        Proxy proxy=new Proxy(client);
        proxy.realizareRezervare();


    }
}