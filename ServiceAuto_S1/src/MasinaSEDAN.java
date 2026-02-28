public class MasinaSEDAN extends AMasina{
    public MasinaSEDAN(String  nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String getTip() {
        return "SEDAN";
    }
}
