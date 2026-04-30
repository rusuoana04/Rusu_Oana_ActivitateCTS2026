public class OfertaPachetCazare extends OfertaPachetTuristic{
    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervare anulata");
    }
}
