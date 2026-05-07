public interface Optiune {
    void adaugareNod(Optiune optiune) throws Exception;
    void  stergereNod(Optiune optiune) throws Exception;
    Optiune getNod(int index) throws Exception;
    void  descriere() throws Exception;

}
