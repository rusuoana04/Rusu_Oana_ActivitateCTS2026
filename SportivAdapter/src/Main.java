public class Main {
    public static void main(String[] args) {
        AplicatieCompanie aplicatieCompanie=new AplicatieCompanie("Steaua-Dinamo", 50);
        Adapter adapter=new Adapter(aplicatieCompanie);
        adapter.cumparaBilet();

    }
}