public class BonDecorat extends ADecorator{
    public BonDecorat(IBon iBon) {
        super(iBon);
    }

    @Override
    public void printeazaBon() {
        super.printeazaBon();
        System.out.println("La multi ani!");
    }
}
