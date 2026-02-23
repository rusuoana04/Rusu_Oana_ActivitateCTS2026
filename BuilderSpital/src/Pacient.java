public class Pacient {
    private boolean hasPatRabatabi;
    private boolean hasMicDejun;
    private boolean hasPapuciCamera;
    private boolean hasHalatInterior;

    public Pacient(boolean hasPatRabatabi, boolean hasMicDejun, boolean hasPapuciCamera, boolean hasHalatInterior) {
        this.hasPatRabatabi = hasPatRabatabi;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuciCamera = hasPapuciCamera;
        this.hasHalatInterior = hasHalatInterior;
    }

    public boolean isHasPatRabatabi() {
        return hasPatRabatabi;
    }

    public void setHasPatRabatabi(boolean hasPatRabatabi) {
        this.hasPatRabatabi = hasPatRabatabi;
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
        return "Pacient: {" +
                "hasPatRabatabi=" + hasPatRabatabi +
                ", hasMicDejun=" + hasMicDejun +
                ", hasPapuciCamera=" + hasPapuciCamera +
                ", hasHalatInterior=" + hasHalatInterior +
                '}';
    }
}
