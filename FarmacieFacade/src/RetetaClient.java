public class RetetaClient {
    private boolean reteta;

    public RetetaClient(boolean reteta) {
        this.reteta = reteta;
    }

    public boolean verificareReteta()
    {
        if(reteta==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
