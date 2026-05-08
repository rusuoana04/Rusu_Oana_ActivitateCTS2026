public class Persoana implements ITribuna{
    private double inaltime;
    private double latime;


    public Persoana(double inaltime, double latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public void descriereTribuna(DetaliiTribuna detaliiTribuna) {
        System.out.println("Persoana cu inaltime: "+inaltime+ ", latime: "+ latime+ ", a fost desenata in tribuna la pozitia: "+detaliiTribuna.getPozitie()+ ", culoare tricou: "+detaliiTribuna.getCuloareTricou());
    }
}
