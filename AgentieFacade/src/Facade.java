public class Facade {

    public Facade() {
    }

    public void rezervaPachetCazareTransport(String numeHotel, int nrNopti, String companie, float pret )
    {
        PachetCazare pachetCazare=new PachetCazare(numeHotel, nrNopti);
        PachetTransport pachetTransport=new PachetTransport(companie, pret);
        pachetCazare.rezervaHotel();
        pachetTransport.rezervaZbor();


        System.out.println("S-a trealizat o rezervare completa pachet cazare si transport ");

    }
}
