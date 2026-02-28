public class MasinaSUV extends AMasina{
    public MasinaSUV(String  nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String getTip() {
        return "SUV";
    }
}
