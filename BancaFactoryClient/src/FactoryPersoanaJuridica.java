public class FactoryPersoanaJuridica  implements FactoryClient{

    @Override
    public IClient crearePachet() {
        return new PersoanaJuridica();
    }
}
