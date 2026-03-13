package cts.rusu.oana.as.pattern.Singleton;

public class Cuptor implements ICuptor{
    private static Cuptor instance=null;
    private APreparat preparatCurent;





    private Cuptor() {
    }

    public static Cuptor getInstance()
    {
        if(instance==null)
        {
            instance=new Cuptor();

        }
        return instance;
    }

    @Override
    public void gatirePreparat(APreparat preparat) {
        if(preparatCurent==null)
        {
            preparatCurent=preparat;
            System.out.println("Preparatul: "+ preparat.getNumePreparat()+ " cu timpul de gatire: "+ preparat.getTimpPreparat()+ " de minute"+" a intrat in cupor");
        }
        else
        {
            System.out.println("Cuptorul e ccupat-Preparatul: "+ preparat.getNumePreparat()+ " cu timpul de gatire: "+ preparat.getTimpPreparat()+ " de minute"+ " e inca in cupor");
        }
    }

    @Override
    public void finalizarePreparat() {
        if(preparatCurent!=null)
        {
            System.out.println("Preparatul: "+ preparatCurent.getNumePreparat()+ " cu timpul de gatire: "+ preparatCurent.getTimpPreparat()+" de minute"+ " a iesit din cupor");
            preparatCurent=null;
        }
    }


}
