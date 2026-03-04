public class FactoryPersoanaFizica implements FactoryClient{
    @Override
    public IClient crearePachet() {
        return new PersoanaFizica();
    }
}
