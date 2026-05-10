import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject{
    private List<Observar> observeri;
    private String nume;

    public Spital( String nume) {
        this.nume = nume;
        observeri=new ArrayList<Observar>();
    }

    @Override
    public void adaugaObserver(Observar observar) {
        observeri.add(observar);
    }

    @Override
    public void stergeObserver(Observar observar) {
        observeri.remove(observar);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observar observar: observeri)
        {
            observar.receptioneazaMesaj(nume+ ": "+ mesaj);
        }
    }

    public void notificareVirus()
    {
        trimiteNotificare("Atentie epidemie Virusul x ");
    }

}
