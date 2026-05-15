public class Clip implements IClip {
    private String nume;
    private int durata;
    private boolean esteHD;

    public Clip(String nume, int durata, boolean esteHD) {
        this.nume = nume;
        this.durata = durata;
        this.esteHD = esteHD;
    }

    @Override
    public void adaugaNod(IClip iClip) throws Exception {
        throw  new Exception("Neimplementat");
    }

    @Override
    public void stergeNod(IClip iClip) throws Exception {
        throw  new Exception("Neimplementat");
    }

    @Override
    public IClip getNod(int index) throws Exception {
        throw  new Exception("Neimplementat");
    }

    @Override
    public void decriere() {
        System.out.println("Clip: "+nume+ " durata:"+durata+" calitateHD: "+esteHD);
    }
}
