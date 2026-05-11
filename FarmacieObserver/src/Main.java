public class Main {
    public static void main(String[] args) {
        Client client=new Client("Ion Ionel");
        Client client2=new Client("Ion Georgel");

        Farmacie farmacie=new Farmacie(" Farmacia Tei");

        farmacie.adaugareObserver(client2);
        farmacie.adaugareObserver(client);

        farmacie.notificareReducere();
        System.out.println();

        farmacie.stergereObserver(client2);
        farmacie.notificareReducere();
    }
}