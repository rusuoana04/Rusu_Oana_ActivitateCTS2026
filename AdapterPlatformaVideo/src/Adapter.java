public class Adapter implements IClip{
    private ExternalVideoPlayer externalVideoPlayer;

    private int quality;


    public Adapter(ExternalVideoPlayer externalVideoPlayer) {
        this.externalVideoPlayer = externalVideoPlayer;

    }

    @Override
    public void playClip(String fileName) {
        externalVideoPlayer.startVideo(fileName,quality);

    }
}
