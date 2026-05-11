public interface Subject {
    void adaugareObserver(Observer observer);
    void stergereObserver(Observer observer);
    void trimitereMesaj(String mesaj);
}
