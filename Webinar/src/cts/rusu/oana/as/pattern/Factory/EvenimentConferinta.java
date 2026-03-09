package cts.rusu.oana.as.pattern.Factory;

public class EvenimentConferinta implements IEvent{
    private final String titlu;

    public EvenimentConferinta(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public void descriere() {
        System.out.println("Tip Eveniment-Conferinta");
    }

    @Override
    public String getTitlu() {
        return titlu;
    }


}
