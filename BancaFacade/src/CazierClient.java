public class CazierClient {
    private boolean cazier;

    public CazierClient(boolean cazier) {
        this.cazier = cazier;
    }

    public boolean verificareCazier()
    {
        if(cazier==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
