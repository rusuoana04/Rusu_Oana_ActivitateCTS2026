public class Analize implements IAnalize{
    private int idPacient;
    private String numePacient;

    public Analize(int idPacient, String numePacient) {
        this.idPacient = idPacient;
        this.numePacient = numePacient;
    }

    @Override
    public void printareAnalize() {
        System.out.println("S-au printat rezultatele analizelor pentru pacientul cu id: "+idPacient+ " nume: "+numePacient);
    }
}
