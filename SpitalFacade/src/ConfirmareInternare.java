public class ConfirmareInternare {
    private String numePacient;

    public ConfirmareInternare(String numePacient) {
        this.numePacient = numePacient;
    }

    public boolean verificaConfirmareInternare(String numePacient)
    {
        if(numePacient==numePacient)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
