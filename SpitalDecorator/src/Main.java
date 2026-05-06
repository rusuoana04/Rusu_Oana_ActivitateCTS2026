public class Main {
    public static void main(String[] args) {

        IAnalize iAnalize=new Analize(1, "Ion");
        iAnalize.printareAnalize();


        System.out.println("Analize cu decorator");
        AnalizeDecorator analizeDecorator=new AnalizeDecorator(iAnalize);
        analizeDecorator.printareAnalize();
    }
}