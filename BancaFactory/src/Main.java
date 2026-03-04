public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        ICredit credit;
        try {
           credit= factory.creareCredit(TipCredit.Ipotecar);
           credit.descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}