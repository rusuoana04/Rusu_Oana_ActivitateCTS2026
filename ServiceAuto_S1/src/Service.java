public class Service implements IService{
    private static Service instance=null;
    private AMasina masinaCurenta;

    public Service() {
        this.masinaCurenta=null;
    }

    @Override
    public void intrareService(AMasina masina)
    {
        if(masinaCurenta==null)
        {
            masinaCurenta=masina;
            System.out.println("Masina: "+ masina.getNrInmatriculare()+ " de tip "+ masina.getTip()+ " a intrat in service");
        }
        else
        {
            System.out.println(" Service ocupat! Masina: "+ masinaCurenta.getNrInmatriculare()+ " este in reparatie");
        }

    }

    @Override
    public void iesireService() {
        if(masinaCurenta!=null)
        {
            System.out.println("Masina: " + masinaCurenta.getNrInmatriculare()+ " a iesit din service");
            masinaCurenta=null;
        }
        else {
            System.out.println("Nu exista masina in service");

        }

    }
    public static Service getInstance()
    {
        if(instance==null)
        {
            instance=new Service();
        }
        return instance;
    }
}