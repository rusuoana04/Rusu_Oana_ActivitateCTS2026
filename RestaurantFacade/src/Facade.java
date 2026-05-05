public class Facade {

    public  void verificaMasa(int nrMasa)
    {
        MasaDebarasata masaDebarasata=new MasaDebarasata(nrMasa);
        MasaLibera masaLibera=new MasaLibera(nrMasa);
        MasaServetele masaServetele=new MasaServetele(nrMasa);
        System.out.println("Masa debarasata: "+masaDebarasata.verificaMasaDebarasata());
        System.out.println("Masa libera: "+masaLibera.verificareMasaLibera());
        System.out.println("Masa servetele noi: "+masaServetele.verificaServeteleMasa());

        if(masaDebarasata.verificaMasaDebarasata()&& masaLibera.verificareMasaLibera()&& masaServetele.verificaServeteleMasa() ==true)
        {
            System.out.println("Se poate rezerva masa");
        }
        else
        {
            System.out.println("Masa nu este gata de rezervat");
        }
    }


}
