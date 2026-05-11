

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Ion Ionel");
        Client client2=new Client("Ion Georgel");
        Client client3=new Client("Gigel Giorgel");

        AgentieBilete agentieBilete=new AgentieBilete("Dinamo");
        agentieBilete.adaugareObserver(client);
        agentieBilete.adaugareObserver(client2);
        agentieBilete.adaugareObserver(client3);

        agentieBilete.notificareMeciFotbal();
        System.out.println();

        agentieBilete.notificareMeciHandball();
        System.out.println();
        agentieBilete.stergereObserver(client3);
        agentieBilete.notificareMeciVolei();


    }
}