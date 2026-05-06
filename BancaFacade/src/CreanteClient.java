public class CreanteClient {
    public boolean creante;

    public CreanteClient(boolean creante) {
        this.creante = creante;
    }

    public boolean  verificareCreante()
    {
        if(creante==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
