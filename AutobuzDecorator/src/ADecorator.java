public abstract class ADecorator implements IBilet{
    private  IBilet bilet;

    public ADecorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();

    }
}
