public class Main {
    public static void main(String[] args) {

        FabricaDeClienti fabrica=new FabricaDeClienti();

        DetaliiRezervare rezervare1=new DetaliiRezervare(1,2,12);
        DetaliiRezervare rezervare2=new DetaliiRezervare(2,4,10);
        DetaliiRezervare rezervare3=new DetaliiRezervare(5,2,12);

        IClient client1= fabrica.getClient("Ion", "07000000", "ion@gmail.com");
        IClient client2=fabrica.getClient("Gigel", "07200000", "gigel@gmail.com");

        client1.descriereRezervare(rezervare1);
        client2.descriereRezervare(rezervare2);
        client1.descriereRezervare(rezervare3);




        System.out.println("Numar obiecte client memorate: "+ fabrica.getNrClienti());
    }
}