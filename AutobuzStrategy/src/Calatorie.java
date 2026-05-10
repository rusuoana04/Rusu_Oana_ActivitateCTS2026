public class Calatorie {
    private int nrCalatorie;
    private double suma;
    private ModValidare modValidare;

    public Calatorie(int nrCalatorie, double suma, ModValidare modValidare) {
        this.nrCalatorie = nrCalatorie;
        this.suma = suma;
        this.modValidare = modValidare;
    }

    public int getNrCalatorie() {
        return nrCalatorie;
    }

    public void setNrCalatorie(int nrCalatorie) {
        this.nrCalatorie = nrCalatorie;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public ModValidare getModValidare() {
        return modValidare;
    }

    public void setModValidare(ModValidare modValidare) {
        this.modValidare = modValidare;
    }

    public void validareCalatorie( double suma)
    {
        modValidare.validareCalatorie(this.nrCalatorie, suma);
    }


}
