public class Main {
    public static void main(String[] args) {
        INota nota=new Nota(1, 100);
        nota.printezaNota();
        System.out.println("Nota cu decorator");
        NotaDecorata notaDecorata=new NotaDecorata(nota);
        notaDecorata.printezaNota();
    }
}