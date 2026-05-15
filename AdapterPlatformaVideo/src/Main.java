public class Main {
    public static void main(String[] args) {
        IClip platformaStreaming=new PlatformaStreaming();
        platformaStreaming.playClip("exercitiul1");

        ExternalVideoPlayer ex=new ExternalVideoPlayer();
        ex.startVideo("video", 1080);

        IClip adapter=new Adapter(ex);




    }
}