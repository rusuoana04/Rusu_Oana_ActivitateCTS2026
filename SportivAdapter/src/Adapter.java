public class Adapter implements Ebilet{
    private AplicatieCompanie aplicatieCompanie;

    public Adapter(AplicatieCompanie aplicatieCompanie) {
        this.aplicatieCompanie = aplicatieCompanie;
    }

    @Override
    public void cumparaBilet() {
        aplicatieCompanie.rezervareBilet();
        aplicatieCompanie.vanzareBilet();
    }
}
