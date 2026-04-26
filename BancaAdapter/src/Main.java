public class Main {
    public static void main(String[] args) {

        CreditLeasing creditLeasing=new CreditLeasing();
        CreditAdapter creditAdapter=new CreditAdapter(creditLeasing);
        creditAdapter.oferaCredit("Ion", 100000);
    }
}