public class Medic implements Triaj{
private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void internare(Pacient pacient) {
        System.out.println("Medicul "+nume+" interneaza pacientul "+ pacient.getNume());
    }

    @Override
    public void tratareImediata(Pacient pacient) {
        System.out.println("Medicul "+nume+ " va trata imediat pacientul "+ pacient.getNume());
    }
}
