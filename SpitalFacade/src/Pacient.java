public class Pacient {
    private StarePacient  starePacient;

    public Pacient(StarePacient starePacient) {
        this.starePacient = starePacient;
    }

    public boolean verificaStare()
    {
        if(starePacient==StarePacient.grava)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
