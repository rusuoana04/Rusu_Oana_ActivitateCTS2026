public class BiletDecorat extends ADecorator {
    public BiletDecorat(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaBilet() {
        super.printeazaBilet();
        System.out.println("La multi ani!");
    }
}
