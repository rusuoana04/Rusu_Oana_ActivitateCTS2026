public class Antecedente {
    private boolean antecedente;

    public Antecedente(boolean antecedente) {
        this.antecedente = antecedente;
    }

    public boolean verificareAntecedente()
    {
        if(antecedente==true)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
