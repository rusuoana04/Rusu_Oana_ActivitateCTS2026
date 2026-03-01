import AbstractFactory.*;
import AbstractFactory.ISupa;
import AbstractFactory.IDesert;

public class Main {
    public static void main(String[] args) {
//        FactorySupa factorySupa=new FactorySupa();
//        ISupa supa=null;
//        try {
//            supa=factorySupa.creareSupa(TipSupa.supavita);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        supa.descriere();
//        Restaurant restaurant=new RestaurantBuilder().setAsezareGeam(true).setScauneErgonomice(true).build();
//        System.out.println(restaurant);
try {
    FactoryFeluriMancare factory=new Factory();
    ISupa supa1=factory.creareSupa(ESupa.supavita);
    IDesert desert1=factory.creareDesert(EDesert.Clatite);
    supa1.descriere();
    desert1.descriere();
} catch (Exception e) {
    throw new RuntimeException(e);
}


    }



}