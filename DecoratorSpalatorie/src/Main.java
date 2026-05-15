public class Main {
    public static void main(String[] args) {

        ISpalatorie spalatorie=new Spalatorie();
        spalatorie.pornireSpalare();

        SpalatorieDecorata spalatorieDecorata=new SpalatorieDecorata(spalatorie);
        spalatorieDecorata.spalareApaDedurizata();

    }
}