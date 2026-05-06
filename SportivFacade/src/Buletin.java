

public class Buletin {
    private String serie;
    private int nrBilet;

    public Buletin(String serieb, int bilet) {
        this.serie = serieb;
        this.nrBilet = bilet;
    }

    public boolean verificaBuletin(String serieb, int bilet)
    {
        if(serie.equals(serieb)&&nrBilet==bilet)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
