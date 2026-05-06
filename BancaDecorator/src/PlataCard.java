public class PlataCard implements IPlataCard{
    private float suma;

    public PlataCard(float suma) {
        this.suma = suma;
    }

    @Override
    public void plataOnlie() {
        System.out.println("S-a realizat plata cu cardul onine in valoare de: "+suma+ " lei");
    }

    @Override
    public void plataFizica() {
        System.out.println("S-a realizat plata cu cardul fizic in valoare de: "+suma+ " lei");
    }
}
