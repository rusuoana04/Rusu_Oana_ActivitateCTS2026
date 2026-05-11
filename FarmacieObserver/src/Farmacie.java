import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Subject{
    private String nume;
    private List<Observer> observers;

    public Farmacie(String nume) {
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
    public void trimitereMesaj(String mesaj) {
        for(Observer observer: observers)
        {
            observer.receptionareMesaj(nume+ ": "+mesaj);
        }
    }

    public void notificareReducere()
    {
        trimitereMesaj("Avem reducere de 50% la vitamine");
    }
}
