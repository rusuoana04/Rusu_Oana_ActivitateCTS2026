public class Linie implements ILinie {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }


    @Override
    public void descriereAutobuz(DetaliiAutobuz detaliiAutobuz) {
        System.out.println("Pe linia: "+ nrLinie+ ", cu prima statie: "+ primaStatie+ ", ultima Statie: "+ultimaStatie+ ", circula autobuzul model: "+detaliiAutobuz.getModel()+ ", an fabricatie: "+ detaliiAutobuz.getAnFabricatie()+ ", nrLocuri "+detaliiAutobuz.getNrLocuri() );
    }
}
