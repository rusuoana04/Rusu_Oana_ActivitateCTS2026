public class Factura {
    private int NrPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private int cotaTVA;

    public Factura(FacturaBuilder builder)
    {
        this.NrPungi=builder.NrPungi;
        this.plataCuCard=builder.plataCuCard;
        this.cardFidelitate=builder.cardFidelitate;
        this.cotaTVA=builder.cotaTVA;
    }



    @Override
    public String toString() {
        return "Factura: {" +
                "NrPungi=" + NrPungi +
                ", plataCuCard=" + plataCuCard +
                ", cardFidelitate=" + cardFidelitate +
                ", cotaTVA=" + cotaTVA +
                '}';
    }
}
