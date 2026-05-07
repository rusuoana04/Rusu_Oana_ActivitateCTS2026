public class Main {
    public static void main(String[] args) throws Exception {

        Optiune departamente=new Categorie("Departamente");
        Optiune medicinaGenerala=new Categorie("Medicina Generala");
        Optiune chirurgie=new Categorie( "Chirurgie");

        Optiune ginecologie=new Item("Ginecologie" );
        Optiune cardiologie=new Item("Cardiologie");

        Optiune chirurgieGenerala=new Item("Chirurgie Generala" );
        Optiune chirurgiePlastica=new Item( "Chirurgie Plastica");

        medicinaGenerala.adaugareNod(ginecologie);
        medicinaGenerala.adaugareNod(cardiologie);

        chirurgie.adaugareNod(chirurgieGenerala);
        chirurgie.adaugareNod(chirurgiePlastica);

        departamente.adaugareNod(medicinaGenerala);
        departamente.adaugareNod(chirurgie);

        departamente.descriere();
        System.out.println();
        System.out.println("Stergere nod sectie medicina generala");
        System.out.println();
        departamente.stergereNod(medicinaGenerala);
        departamente.descriere();
        System.out.println();
        System.out.println("Readaugare nod sectie medicina generala");
        System.out.println();
        departamente.adaugareNod(medicinaGenerala);
        departamente.descriere();
        System.out.println(departamente.getNod(1));




    }
}