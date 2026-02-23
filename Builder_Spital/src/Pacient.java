package Builder_Spital.src;

public class Pacient {
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciCamera;
    private boolean hasHalatInterior;


    public Pacient(boolean hasPatRabatabil, boolean hasMicDejun, boolean hasPapuciCamera, boolean hasHalatInterior) {
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuciCamera = hasPapuciCamera;
        this.hasHalatInterior = hasHalatInterior;
    }

    public boolean isHasPatRabatabil() {
        return hasPatRabatabil;
    }

    public void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public boolean isHasMicDejun() {
        return hasMicDejun;
    }

    public void setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
    }

    public boolean isHasPapuciCamera() {
        return hasPapuciCamera;
    }

    public void setHasPapuciCamera(boolean hasPapuciCamera) {
        this.hasPapuciCamera = hasPapuciCamera;
    }

    public boolean isHasHalatInterior() {
        return hasHalatInterior;
    }

    public void setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDejun=" + hasMicDejun +
                ", hasPapuciCamera=" + hasPapuciCamera +
                ", hasHalatInterior=" + hasHalatInterior +
                '}';
    }
}
