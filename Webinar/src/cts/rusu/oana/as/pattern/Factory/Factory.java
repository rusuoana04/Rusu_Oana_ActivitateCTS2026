package cts.rusu.oana.as.pattern.Factory;

public class Factory {


    public IEvent creareEveniment(TipEveniment tipEveniment, String titlu) throws Exception {
        switch (tipEveniment)
        {
            case webinar:
                return new EvenimentWebinar(titlu);
            case workshop:
                return new EvenimentWorkshop(titlu);
            case conferinta:
                return new EvenimentConferinta(titlu);
            default:
                throw new Exception("Eroare creare eveniment!");
        }
    }




}
