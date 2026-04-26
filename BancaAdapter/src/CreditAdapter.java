public class CreditAdapter extends  CreditBanca{
    private CreditLeasing creditLeasing;

    public CreditAdapter(CreditLeasing creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    @Override
    public void oferaCredit(String nume, double suma) {
        creditLeasing.oferaLeasing(nume,suma);
    }
}
