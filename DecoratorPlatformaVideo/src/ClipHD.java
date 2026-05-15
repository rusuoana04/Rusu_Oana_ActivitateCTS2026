public class ClipHD extends ADecorator{
    public ClipHD(IClip iClip) {
        super(iClip);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Activare mod HD");
    }
}
