public class Main {
    public static void main(String[] args) {
        IBon bon=new Bon(1,100);
        bon.printeazaBon();


        System.out.println("Bon cu decorator");
        BonDecorat bonDecorat=new BonDecorat(bon);
        bonDecorat.printeazaBon();
    }
}