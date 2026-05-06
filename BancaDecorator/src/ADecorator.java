public abstract class ADecorator implements IPlataCard {
    IPlataCard iPlataCard;

    public ADecorator(IPlataCard iPlataCard) {
        this.iPlataCard = iPlataCard;
    }

    @Override
    public void plataOnlie() {
        iPlataCard.plataOnlie();
    }

    @Override
    public void plataFizica() {
        iPlataCard.plataFizica();
    }
}
