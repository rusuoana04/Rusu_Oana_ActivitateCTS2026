

public class Main {
    public static void main(String[] args) throws Exception {
//    Service service1=Service.getInstance();
//    Service service2=Service.getInstance();
//    System.out.println(service1==service2);
//    AMasina m1=new Masina("B100WWW");
//    AMasina m2=new Masina("B101WXZ");
//    service1.intrareService(m1);
//    service2.intrareService(m2);
//    service1.iesireService();
//    service2.intrareService(m2);

AMasina m1=FactoryMasina.creareMasina(TipMasina.SEDAN, "B100XYZ");
AMasina m2=FactoryMasina.creareMasina(TipMasina.SUV, "B181QHQ");

System.out.println("Masina: "+ m1.getNrInmatriculare()+ " de tip:" +m1.getTip());
System.out.println("Masina: "+ m2.getNrInmatriculare()+ " de tip:" +m2.getTip());

    }
}