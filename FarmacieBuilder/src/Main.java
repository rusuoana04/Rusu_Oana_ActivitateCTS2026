public class Main {
    public static void main(String[] args) {
        Factura factura=new FacturaBuilder().setNrPungi(1).setPlataCuCard(true).setPlataCuCard(true).build();
        System.out.println(factura);
    }
}