public class SpectatorVIP implements TipSpectator{
    @Override
    public void verificareSpectator(String nume) {
        System.out.println(" Spectatorul cu numele: "+nume+ " are bilet VIP  si verificarea se face doar pentru bilet" );

    }
}
