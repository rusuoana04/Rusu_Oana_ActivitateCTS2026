public class StocMedicamente {

    private int cantitate;

    public StocMedicamente(int cantitate) {
        this.cantitate = cantitate;
    }

    public boolean verificareStoc(int stoc)
    {
        if(cantitate<stoc)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
