public class Main {
    public static void main(String[] args)
    {
        SoftNou softNou=new SoftNou();
        RestaurantAdapter restaurantAdapter=new RestaurantAdapter(softNou);
        restaurantAdapter.printeazaFacturaVechi();

    }
}