public class Main {
    public static void main(String[] args) {
            FabricaDeAutobuze fabrica=new FabricaDeAutobuze();

            DetaliiAutobuz autobuz1=new DetaliiAutobuz("BMW", 2023, 50);
            DetaliiAutobuz autobuz2=new DetaliiAutobuz("Mercedes", 2000, 30);
            DetaliiAutobuz autobuz3=new DetaliiAutobuz("Fiat", 2018, 20);

            ILinie linie1= fabrica.getLinie(1,"Unirii", "Fundeni");
            ILinie linie2= fabrica.getLinie(2,"Berceni", "Eroilor");
            ILinie linie3= fabrica.getLinie(3,"Gara", "Preciziei");

            linie1.descriereAutobuz(autobuz1);
            linie2.descriereAutobuz(autobuz1);
            linie3.descriereAutobuz(autobuz2);
            linie2.descriereAutobuz(autobuz3);



        System.out.println("S-au salvat  obiecte tip linie in valoare de: "+fabrica.getNrLinii());
    }
}