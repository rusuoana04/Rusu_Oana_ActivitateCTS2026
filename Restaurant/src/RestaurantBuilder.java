public class RestaurantBuilder implements Builder{
public Restaurant restaurant;

 public RestaurantBuilder()
 {
     restaurant=new Restaurant(false,false,false,false,false);
 }


    @Override
    public Restaurant build() {
        return restaurant;
    }

    public RestaurantBuilder setAsezareGeam(boolean asezareGeam)
    {
        this.restaurant.setAsezareGeam(asezareGeam);
        return this;
    }

    public RestaurantBuilder setScauneErgonomice(boolean scauneErgonomice)
    {
        this.restaurant.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RestaurantBuilder setDecorareaMesei(boolean decorareaMesei )
    {
        this.restaurant.setDecorareaMesei(decorareaMesei);
        return this;
    }

    public RestaurantBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata)
    {
        this.restaurant.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public RestaurantBuilder setGenMuzica(boolean genMuzica)
    {
        this.restaurant.setGenMuzica(genMuzica);
        return this;
    }

}
