public class Main {
    public static void main(String[] args) {

        Calator calator=new Calator(0);
        Calator c1=new Calator(2);
        Autobuz autobuz=new Autobuz(calator);
        Autobuz autobuz1=new Autobuz(c1);
        autobuz.oprireStatie();
        autobuz1.oprireStatie();


        Proxy proxy=new Proxy(calator);
        Proxy proxy1=new Proxy(c1);

        proxy.descrire();
        proxy1.descrire();
        proxy.oprireStatie();



    }
}