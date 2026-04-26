public class MedicamenteFarmacie {
    private int id;
    private int stoc;

    public MedicamenteFarmacie(int id, int stoc) {
        this.id = id;
        this.stoc = stoc;
    }

    public MedicamenteFarmacie() {

    }

    public void   setareMedicament(int id)
  {
      this.id=id;
  }

  public boolean  verificareDisponibilitate(int nr)
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
