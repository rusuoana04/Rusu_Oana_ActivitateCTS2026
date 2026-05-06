public class Main {
    public static void main(String[] args) {
        IPlataCard plataCard=new PlataCard(100);
        plataCard.plataFizica();
        plataCard.plataOnlie();

        System.out.println("Plata decorator");
        PlataDecorata plataDecorata=new PlataDecorata(plataCard);
        plataDecorata.plataOnlie();
        plataDecorata.plataFizica();
    }
}