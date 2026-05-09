public class Proxy implements AutobuzNoapte{
    private Autobuz autobuz;

    public Proxy(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public Proxy(Calator calator)
    {
        this.autobuz=new Autobuz(calator);
    }

    @Override
    public void descrire() {
        autobuz.descrire();
    }

    @Override
    public void oprireStatie() {
        if(autobuz.getCalator().getNrCalatori()==0)
        {
            System.out.println("Nu se mai fac opriri in statii si autobuzul merge la autobaza deoarece numarul de calatori este "+autobuz.getCalator().getNrCalatori());
        }
        else
        {
            System.out.println("Autobuzul a oprit in statie pentru: "+autobuz.getCalator().getNrCalatori());
        }
    }
}
