public class Factura extends Printare{
    public Factura(FacturaPrintata facturaPrintata) {
        super(facturaPrintata);
    }

    @Override
    public void printareFelicitare() {
        System.out.println("La multi ani");
    }


}
