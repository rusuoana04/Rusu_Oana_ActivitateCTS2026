import javax.print.DocFlavor;

public class FacturaBuilder implements Builder{

    int NrPungi=0;
    boolean plataCuCard=false;
    boolean cardFidelitate=false;
    int cotaTVA=0;

    public FacturaBuilder setNrPungi(int nrPungi) {
        this.NrPungi = nrPungi;
        return this;
    }

    public FacturaBuilder setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
        return this;
    }

    public FacturaBuilder  setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
        return this;
    }

    @Override
    public Factura build() {
        return new Factura(this);
    }
}
