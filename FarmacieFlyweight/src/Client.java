public class Client implements IReteta {
    private String nume;
    private String nrAsigurare;

    public Client(String nume, String nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }


    @Override
    public void descriereReteta(DetaliiReteta detaliiReteta) {
        System.out.println("Clientul cu numele: "+ nume+ ", si nr asigurare: "+nrAsigurare+ " a achzitionat reteta cu numar: "+detaliiReteta.getNrReteta()+ ", in valoare de: "+ detaliiReteta.getSuma()+ " RON"+ " nr medicamente:  "+detaliiReteta.getNrMedicamente() );
    }
}
