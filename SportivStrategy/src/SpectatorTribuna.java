public class SpectatorTribuna implements TipSpectator{
    @Override
    public void verificareSpectator(String nume) {
        System.out.println(" Spectatorul cu numele: "+nume+ " are bilet la tribuna si verificarea se face doar pentru bagaje" );

    }
}
