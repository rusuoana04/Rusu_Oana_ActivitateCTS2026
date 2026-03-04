public class Main {
    public static void main(String[] args) {
        FactoryClient factory=new FactoryPersoanaFizica();
        FactoryClient factory2=new FactoryPersoanaJuridica();
        IClient client;
        IClient client2;
        try {
            client=factory.crearePachet();
            client2=factory2.crearePachet();
            client.descriere();
            client2.descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}