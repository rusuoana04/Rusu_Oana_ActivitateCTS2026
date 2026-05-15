public class SubtitrariClip extends ADecorator{
    public SubtitrariClip(IClip iClip) {
        super(iClip);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Activare subtitrari");
    }
}
