public class CommandInternare implements Command{
    private Triaj medic;
    private Pacient pacient;

    public CommandInternare(Triaj medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.internare(pacient);
    }
}
