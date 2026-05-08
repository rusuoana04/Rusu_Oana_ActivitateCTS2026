public class DetaliiCont {
    private String nrCont;
    private float suma;
    private String numeBanca;
    private String sucursala;
    private float capital;


    public DetaliiCont(String nrCont, float suma, String numeBanca, String sucursala, float capital) {
        this.nrCont = nrCont;
        this.suma = suma;
        this.numeBanca = numeBanca;
        this.sucursala = sucursala;
        this.capital = capital;
    }

    public String getNrCont() {
        return nrCont;
    }

    public void setNrCont(String nrCont) {
        this.nrCont = nrCont;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getNumeBanca() {
        return numeBanca;
    }

    public void setNumeBanca(String numeBanca) {
        this.numeBanca = numeBanca;
    }

    public String getSucursala() {
        return sucursala;
    }

    public void setSucursala(String sucursala) {
        this.sucursala = sucursala;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }
}
