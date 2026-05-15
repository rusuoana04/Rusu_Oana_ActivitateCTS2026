public class SpalatorieDecorata extends AbstractAutoWashOptions{


    public SpalatorieDecorata(ISpalatorie spalatorie) {
        super(spalatorie);
    }

    @Override
    public void pornireSpalare() {
        super.pornireSpalare();
    }

    @Override
    public void spalarePerii() {
        System.out.println("spalarePerii");
    }

    @Override
    public void spalareSasiu() {
        System.out.println("spalareSasiu");
    }

    @Override
    public void spalareApaDedurizata() {
        System.out.println("spalareApaDedurizata");
    }
}
