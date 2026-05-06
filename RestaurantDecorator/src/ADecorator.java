public abstract class ADecorator implements INota {
    private INota iNota;

    public ADecorator(INota iNota) {
        this.iNota = iNota;
    }

    @Override
    public void printezaNota() {
        iNota.printezaNota();
    }
}
