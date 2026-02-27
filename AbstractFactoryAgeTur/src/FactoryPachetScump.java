public class FactoryPachetScump implements Factory{
    @Override
    public PachetCazare crearePachetCazare() {
        return new CazareScumpa();
    }

    @Override
    public PachetTransport crearePachetTransport() {
        return new TransportScump();
    }
}
