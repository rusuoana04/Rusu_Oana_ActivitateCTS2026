public class FactoryPachetIeftin implements Factory{
    @Override
    public PachetCazare crearePachetCazare() {
        return new CazareIeftina();
    }

    @Override
    public PachetTransport crearePachetTransport() {
        return new TranportIeftin();
    }
}
