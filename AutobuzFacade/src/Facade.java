public class Facade {
    UsaFata usaFata=new UsaFata();
    UsaMijloc usaMijloc=new UsaMijloc();
    UsaSpate usaSpate=new UsaSpate();
    public void  butonDeschidereUsi()
    {
        System.out.println("Usi deschise");
        usaFata.deschidereUsaFata();
        usaMijloc.deschidereUsaMijloc();
        usaSpate.deschidereUsaSpate();



    }

    public void butonInchidereUsi()
    {
        System.out.println("Usi inchise");
        usaFata.inchidereUsaFata();
        usaMijloc.inchidereUsaMijloc();
        usaSpate.inchidereUsaSpate();
    }
}
