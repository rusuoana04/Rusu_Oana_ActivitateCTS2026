public class Main {
    public static void main(String[] args) {
        Service service1=Service.getInstance();
        Service service2=Service.getInstance();


        System.out.println(service1==service2);
        AMasina m1=new Masina("B100WWW");
        AMasina m2=new Masina("B200WYZ");

        service1.intrareService(m1);
        service2.intrareService(m2);
        service1.iesireService();
        service2.intrareService(m2);


    }
}