package cts.rusu.oana.as.pattern.Factory;

public class EvenimentWebinar implements IEvent{
    private final String titlu;

    public EvenimentWebinar(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public void descriere() {
        System.out.println("Tip Eveniment-Webinar ");
    }

    @Override
    public String getTitlu() {
        return titlu;
    }




}
