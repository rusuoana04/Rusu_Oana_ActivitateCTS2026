public class Main {
PachetCazare obtinereCazare(Factory factory)
{
    return factory.crearePachetCazare();
}

    public static void main(String[] args) {
    Factory factory1=new FactoryPachetIeftin();
    PachetCazare pachetCazare= factory1.crearePachetCazare();
    pachetCazare.descriere();

    }
}