public class PachetTransport {
    private String companieZbor;
    private float pret;

    public PachetTransport(String companieZbor, float pret) {
        this.companieZbor = companieZbor;
        this.pret = pret;
    }

    public void rezervaZbor()
    {
        System.out.println("S-a rezervat zborul pentru compania: "+ companieZbor+ " la pretul: "+ pret);
    }

    @Override
    public String toString() {
        return "PachetTransport{" +
                "companieZbor='" + companieZbor + '\'' +
                ", pret=" + pret +
                '}';
    }
}
