public class DetaliiRezervare {
    private int nrMasa;
    private int nrPersoanre;
    private int oraRezervare;

    public DetaliiRezervare(int nrMasa, int nrPersoanre, int oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoanre = nrPersoanre;
        this.oraRezervare = oraRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoanre() {
        return nrPersoanre;
    }

    public void setNrPersoanre(int nrPersoanre) {
        this.nrPersoanre = nrPersoanre;
    }

    public int getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(int oraRezervare) {
        this.oraRezervare = oraRezervare;
    }
}
