import java.util.ArrayList;
import java.util.List;

public class AgentieBilete implements Subject{
    private String nume;
    private List<Observer> observers;

    public AgentieBilete(String nume) {
        this.nume = nume;
        observers=new ArrayList<Observer>();
    }

    @Override
    public void adaugareObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void stergereObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void trimitereNotificare(String mesaj) {
        for(Observer observer: observers)
        {
            observer.receptionareMesaj(nume+ " : "+mesaj);
        }
    }
    public void notificareMeciFotbal()
    {
        trimitereNotificare("Este programat un meci de fotbal pe stadion la ora 18:00");
    }
    public void notificareMeciHandball()
    {
        trimitereNotificare("Este programat un meci de handball pe stadion la ora 20:00");
    }

    public void notificareMeciVolei()
    {
        trimitereNotificare("Este programat un meci de volei pe stadion la ora 14:00");
    }


}
