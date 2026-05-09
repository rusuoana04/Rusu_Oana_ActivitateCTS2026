public class Internare implements IInternare{
   private Pacient pacient;

    public Internare(Pacient pacient) {
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void descriere() {
        System.out.println("S-a realizat internarea pentru persoana "+pacient.getNume());
    }

    @Override
    public void verificareAsigurare() {
        System.out.println("S-a verificat asigurarea pentru: "+ pacient.getNume());
    }
}
