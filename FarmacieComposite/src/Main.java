public class Main {
    public static void main(String[] args) {

        Optiune farmacie=new Categorie("Farmacie");
        Optiune raceala=new Categorie("Raceala");
        Optiune durere=new Categorie("Durere");
        Optiune antibiotice=new Categorie("Antibiotice");

        Optiune adulti=new Item("Adulti");
        Optiune copii=new Item("Copii");

        try {
            raceala.adaugareNod(adulti);
            raceala.adaugareNod(copii);
            durere.adaugareNod(adulti);
            durere.adaugareNod(copii);
            antibiotice.adaugareNod(adulti);
            antibiotice.adaugareNod(copii);

            farmacie.adaugareNod(raceala);
            farmacie.adaugareNod(durere);
            farmacie.adaugareNod(antibiotice);

            farmacie.descriere();
            System.out.println();
            System.out.println("Stergere nod sectie durere");
            System.out.println();
            farmacie.stergereNod(durere);
            farmacie.descriere();
            System.out.println();
            System.out.println("Readaugare nod sectie durere");
            System.out.println();
            farmacie.adaugareNod(durere);
            farmacie.descriere();
            System.out.println();
            System.out.println( farmacie.getNod(1));



        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}