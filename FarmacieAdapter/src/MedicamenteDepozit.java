public class MedicamenteDepozit {
    private int id;
    private int stoc;

    public MedicamenteDepozit(int id, int stoc) {
        this.id = id;
        this.stoc = stoc;
    }

    public boolean verificăStocPentruMedicament(int id, int nr)
    {
        if(nr<=stoc)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
