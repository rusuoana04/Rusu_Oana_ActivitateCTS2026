public class FiltruClip extends ADecorator{
    public FiltruClip(IClip iClip) {
        super(iClip);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Activare filtru special");
    }
}
