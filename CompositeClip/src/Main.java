public class Main {
    public static void main(String[] args) {

        IClip stream=new Playlist("Platforma streaming");
        IClip playlist1=new Playlist("Java");
        IClip playlist2=new Playlist("CTS");
        IClip subplaylist=new Playlist("Design patterns structurale");

        IClip clip1=new Clip("inroducere in java", 60, true);
        IClip clip2=new Clip("programare orientata obiect", 130, false);

        IClip clip3=new Clip("Design pattern Composite", 60, true);
        IClip clip4=new Clip("Design pattern Flyweight", 90, true);

        try {
            playlist1.adaugaNod(clip1);
            playlist1.adaugaNod(clip2);
            playlist2.adaugaNod(clip3);
            playlist2.adaugaNod(subplaylist);
            subplaylist.adaugaNod(clip4);

            stream.adaugaNod(playlist1);
            stream.adaugaNod(playlist2);
            stream.decriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}