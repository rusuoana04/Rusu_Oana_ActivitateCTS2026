public class DetaliiReteta {
    private int nrReteta;
    private float suma;
    private int nrMedicamente;

    public DetaliiReteta(int nrReteta, float suma, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.suma = suma;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }
}
