public class PlataDecorata extends ADecorator{
    public PlataDecorata(IPlataCard iPlataCard) {
        super(iPlataCard);
    }

    @Override
    public void plataOnlie() {
        super.plataOnlie();
        System.out.println("S-a rezalizat plata ContactLess");

    }

    @Override
    public void plataFizica() {
        super.plataFizica();
        System.out.println("S-a rezalizat plata ContactLess");
    }
}
