public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic=new PachetCazare();
        pachetTuristic.descriere();
        OfertaPachetCazare oferta=new OfertaPachetCazare(pachetTuristic);
        oferta.anulareRezervare();


    }
}