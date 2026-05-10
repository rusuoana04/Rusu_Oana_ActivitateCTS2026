public class Pacient implements Observar{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }


    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println(nume+ " ai primit mesajul  "+ mesaj);
    }
}
