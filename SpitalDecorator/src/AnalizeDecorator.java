public class AnalizeDecorator extends ADecorator{
    public AnalizeDecorator(IAnalize iAnalize) {
        super(iAnalize);
    }

    @Override
    public void printareAnalize() {
        super.printareAnalize();
        System.out.println("Printare analize online");
    }
}
