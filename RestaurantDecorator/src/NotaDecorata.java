public class NotaDecorata extends ADecorator{
    public NotaDecorata(INota iNota) {
        super(iNota);
    }

    @Override
    public void printezaNota() {
        super.printezaNota();
        System.out.println("La multi ani!");
    }
}
