

public class Main {
    public static void main(String[] args) {
       Client client=new Client("Ion Ionel", false);
       Credit credit=new Credit(client);
       credit.descriere();
       credit.creareCont();

       Proxy proxy=new Proxy(client);
       proxy.descriere();
       proxy.creareCont();


    }
}