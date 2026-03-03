public class Reteta implements  IReteta{
    private int paracetamol;
    private int ibuprofen;
    private int antibiotic;

    public Reteta() {
    }

    public Reteta(int antibiotic, int paracetamol, int ibuprofen) {
        this.antibiotic = antibiotic;
        this.paracetamol = paracetamol;
        this.ibuprofen = ibuprofen;
    }

    public int getParacetamol() {
        return paracetamol;
    }

    public void setParacetamol(int paracetamol) {
        this.paracetamol = paracetamol;
    }

    public int getIbuprofen() {
        return ibuprofen;
    }

    public void setIbuprofen(int ibuprofen) {
        this.ibuprofen = ibuprofen;
    }

    public int getAntibiotic() {
        return antibiotic;
    }

    public void setAntibiotic(int antibiotic) {
        this.antibiotic = antibiotic;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "paracetamol=" + paracetamol +
                ", ibuprofen=" + ibuprofen +
                ", antibiotic=" + antibiotic +
                '}';
    }

    @Override
    public IReteta copy() {
       Reteta copy=new Reteta();
       copy.paracetamol=this.paracetamol;
       copy.ibuprofen=this.ibuprofen;
       copy.antibiotic=this.antibiotic;
       return copy;
    }
}
