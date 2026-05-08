public class Main {
    public static void main(String[] args) {

        FabricaDeClienti fabrica=new FabricaDeClienti();

        DetaliiReteta reteta1=new DetaliiReteta(1,100,2);
        DetaliiReteta reteta2=new DetaliiReteta(2, 200,3);
        DetaliiReteta reteta3=new DetaliiReteta(4, 150,3);

        IReteta client1= fabrica.getClient("Ion", "q123");
        IReteta client2=fabrica.getClient("Gigel", "w234");

        client1.descriereReteta(reteta1);
        client2.descriereReteta(reteta2);
        client2.descriereReteta(reteta3);


        System.out.println("Nr obiecte client salvate:"+ fabrica.getNrClienti());
    }
}