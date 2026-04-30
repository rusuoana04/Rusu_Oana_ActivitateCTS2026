public class Main {
    public static void main(String[] args)
    {

        FacturaPrintata facturaPrintata=new FacturaVeche();
        facturaPrintata.printareFactura();
        Factura factura=new Factura(facturaPrintata);
        factura.printareFelicitare();

    }
}