public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupa=new FactorySupa();
        ISupa supa=null;
        try {
            supa=factorySupa.creareSupa(TipSupa.supavita);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        supa.descriere();
    }
}