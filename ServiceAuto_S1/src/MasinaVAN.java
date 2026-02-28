public class MasinaVAN extends AMasina{
    public MasinaVAN(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String getTip() {
        return "VAN";
    }
}
