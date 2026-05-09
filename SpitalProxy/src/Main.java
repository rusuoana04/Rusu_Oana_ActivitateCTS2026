public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Ion Ionel",false);
        Internare internare=new Internare(pacient);
        internare.verificareAsigurare();

        Proxy proxy=new Proxy(pacient);
        proxy.verificareAsigurare();


    }
}