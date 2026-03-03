public class Main {
    public static void main(String[] args) {
        Reteta r1=new Reteta(20,10,15);
        Reteta r2= (Reteta) r1.copy();
        System.out.println(r1);
        System.out.println(r2);
    }
}