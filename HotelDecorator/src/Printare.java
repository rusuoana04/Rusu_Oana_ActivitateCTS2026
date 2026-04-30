public abstract class Printare implements FacturaPrintata {
private FacturaPrintata facturaPrintata;

    public Printare(FacturaPrintata facturaPrintata) {
        this.facturaPrintata = facturaPrintata;
    }

    @Override
    public void printareFactura() {
        facturaPrintata.printareFactura();
    }

    public abstract void printareFelicitare();
}
