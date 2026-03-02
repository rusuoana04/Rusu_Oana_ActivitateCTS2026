public class FactoryClip {
    public static IClip creareClip(TipClip tipClip, String nume, int durata) throws Exception {
        switch (tipClip)
        {
            case LIVE:
                return new ClipuriLive(nume, durata);
            case TUTORIAL:
                return new ClipuriTutorial(nume, durata);
            default:
                throw new Exception("Eroare!");
        }
    }
}
