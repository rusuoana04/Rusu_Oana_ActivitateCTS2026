public class Autobuz implements AutobuzNoapte {
    private Calator calator;

    public Autobuz(Calator calator) {
        this.calator = calator;
    }

    public Calator getCalator() {
        return calator;
    }

    public void setCalator(Calator calator) {
        this.calator = calator;
    }

    @Override
    public void descrire() {
        System.out.println("Autobuz de noapte");
    }

    @Override
    public void oprireStatie() {
        System.out.println("Autobuzul opreste in statie pentru: "+ calator.getNrCalatori()+ " calatori");
    }
}
