public class Cazier {
    private boolean cazier;

    public Cazier(boolean cazier) {
        this.cazier=cazier;
    }

    public boolean verificaCazier()
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
