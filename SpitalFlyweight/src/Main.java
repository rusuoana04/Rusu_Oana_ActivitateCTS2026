public class Main {
    public static void main(String[] args) {
        FabricaDePacienti fabrica = new FabricaDePacienti();

        DetaliiInternare d1 = new DetaliiInternare(101, 5, 3);
        DetaliiInternare d2 = new DetaliiInternare(102, 2, 5);
        DetaliiInternare d3 = new DetaliiInternare(103, 1, 7);

        IInternare p1 = fabrica.getPacient("Ion Popescu", "0722334455", "Bucuresti");
        IInternare p2 = fabrica.getPacient("Ion Popescu", "0722334455", "Bucuresti"); // același obiect
        IInternare p3 = fabrica.getPacient("Maria Ionescu", "0744556677", "Cluj");

        p1.descriereInternare(d1);
        p2.descriereInternare(d2);
        p3.descriereInternare(d3);

        System.out.println("Numar obiecte pacient memorate: " + fabrica.getNrPacienti());


    }
}