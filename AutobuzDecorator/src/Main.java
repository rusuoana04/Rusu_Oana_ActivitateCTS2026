public class Main {
    public static void main(String[] args) {
        IBilet bilet=new Bilet(1, 20);
        bilet.printeazaBilet();
        System.out.println("Bilet cu decorator: ");
        BiletDecorat biletDecorat=new BiletDecorat(bilet);
        biletDecorat.printeazaBilet();

    }
}