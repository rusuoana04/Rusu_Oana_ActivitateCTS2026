public abstract class ADecorator implements IBon{
    protected IBon iBon;

    public ADecorator(IBon iBon) {
        this.iBon = iBon;
    }

    @Override
    public void printeazaBon() {
        iBon.printeazaBon();
    }
}
