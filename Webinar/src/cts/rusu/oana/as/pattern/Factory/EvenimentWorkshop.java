package cts.rusu.oana.as.pattern.Factory;

public class EvenimentWorkshop implements IEvent{
    private final String titlu;

    public EvenimentWorkshop(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public void descriere() {
        System.out.println("Tip Eveniment-Workshop ");
    }

    @Override
    public String getTitlu() {
        return titlu;
    }


}
