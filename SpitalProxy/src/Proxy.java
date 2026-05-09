public class Proxy implements IInternare{
   private Internare internare;

    public Proxy(Internare internare) {
        this.internare = internare;
    }

    public Proxy(Pacient pacient)
    {
        this.internare=new Internare(pacient);
    }

    public Internare getInternare() {
        return internare;
    }

    public void setInternare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void descriere() {
        internare.descriere();
    }

    @Override
    public void verificareAsigurare() {
        if(internare.getPacient().isAreAsigurare()==true)
        {
            System.out.println("S-a realizat internarea pentru pacientul:  "+ internare.getPacient().getNume());
        }
        else
        {
            System.out.println("Nu s-a putut realiza internarea pentru pacientul: "+ internare.getPacient().getNume()+ " deoarece nu are asigurare valida");
        }
    }
}
