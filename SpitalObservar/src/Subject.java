

public interface Subject {
    void adaugaObserver(Observar observar);
    void stergeObserver(Observar observar);
    void trimiteNotificare(String mesaj);
}
