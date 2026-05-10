public class Cash implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume+ " plateste cash suma "+suma);
    }
}
