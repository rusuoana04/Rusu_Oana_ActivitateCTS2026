public abstract class ADecorator implements IClip{
    private IClip iClip;

    public ADecorator(IClip iClip) {
        this.iClip = iClip;
    }

    @Override
    public void play() {
        iClip.play();
    }
}
