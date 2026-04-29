public class PachetCazare {
    private String numeHotel;
    private int nrNopti;

    public PachetCazare(String numeHotel, int nrNopti) {
        this.numeHotel = numeHotel;
        this.nrNopti = nrNopti;
    }

    public void rezervaHotel()
    {
        System.out.println("S-a rezervat hotelul: "+ numeHotel+ " pentru  "+ nrNopti+ " nopti");
    }

    @Override
    public String toString() {
        return "PachetCazare{" +
                "numeHotel='" + numeHotel + '\'' +
                ", nrNopti=" + nrNopti +
                '}';
    }
}
