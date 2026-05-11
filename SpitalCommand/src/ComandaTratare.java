public class ComandaTratare implements Command{
    private Triaj medic;
    private Pacient pacient;

    public ComandaTratare(Triaj medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.tratareImediata(pacient);
    }
}
