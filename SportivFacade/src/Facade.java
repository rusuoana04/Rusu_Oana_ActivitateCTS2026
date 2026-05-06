
public class Facade {
    public  void verificarePersoana(String serie, int nrBilet, boolean cazier, boolean antecedente)
    {
        Buletin buletin=new Buletin(serie, nrBilet);
        Cazier cazier1=new Cazier(cazier);
        Antecedente antecedente1=new Antecedente(antecedente);
        System.out.println("Seria se regaseste pe bilet? "+buletin.verificaBuletin("B123", 1));
        System.out.println("Are cazier? "+cazier1.verificaCazier());
        System.out.println("Are antecedente? "+antecedente1.verificareAntecedente());

        if(buletin.verificaBuletin("B123", 1)==true&& cazier1.verificaCazier()==false&&antecedente1.verificareAntecedente()==false)
        {
            System.out.println("Se poate intra la meci");
        }
        else
        {
            System.out.println("Nu se poate intra la meci");
        }

    }
}
