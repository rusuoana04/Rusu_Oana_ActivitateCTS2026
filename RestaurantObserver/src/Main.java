public class Main {
    public static void main(String[] args) {
        Client client=new Client("Ion Ionel");
        Client client1=new Client("Ion Gigel");

        Restaurant restaurant=new Restaurant("Restaurant Rustic");

        restaurant.adaugareObserver(client);
        restaurant.adaugareObserver(client1);

        restaurant.notificareReducere();

    }
}