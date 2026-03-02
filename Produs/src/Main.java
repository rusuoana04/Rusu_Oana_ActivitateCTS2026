public class Main {
    public static void main(String[] args) {
        Eticheta eticheta=new EtichetaBuilder().setDataExpirare("10.01").setIngrediente("salam").build();

        eticheta.printareMesaj();
    }
}