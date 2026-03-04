public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        IJucator jucator;

        try {
            jucator=factory.creareJucator(TipJucator.Portar);
            jucator.descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}