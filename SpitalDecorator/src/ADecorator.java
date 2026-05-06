public class ADecorator implements IAnalize{
    protected IAnalize iAnalize;

    public ADecorator(IAnalize iAnalize) {
        this.iAnalize = iAnalize;
    }

    @Override
    public void printareAnalize() {
        iAnalize.printareAnalize();
    }
}
