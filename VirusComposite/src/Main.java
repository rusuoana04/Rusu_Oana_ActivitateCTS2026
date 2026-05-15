public class Main {
    public static void main(String[] args) {

        Optiune virus=new Categorie("Continente");
        Optiune asia=new Categorie("Asia");
        Optiune europa=new Categorie("Europa");
        Optiune america=new Categorie("America");

        Optiune china=new Item("China", 20);
        Optiune japonia=new Item("Japonia", 100);
        Optiune rusia=new Item("Rusia", 50);
        Optiune franta=new Item("Franta", 5);
        Optiune sua=new Item("SUA", 26);
        Optiune mexic=new Item("Mexic", 65);

        Optiune corona=new SubCategorie("Corona Virus");
        Optiune gripa=new SubCategorie("Gripa");


        try {
            asia.adaugareNod(corona);
            asia.adaugareNod(gripa);
            europa.adaugareNod(corona);
            europa.adaugareNod(gripa);
            america.adaugareNod(corona);
            america.adaugareNod(gripa);

            corona.adaugareNod(china);
            corona.adaugareNod(japonia);
            corona.adaugareNod(rusia);
            corona.adaugareNod(franta);
            corona.adaugareNod(sua);
            corona.adaugareNod(mexic);
            gripa.adaugareNod(china);
            gripa.adaugareNod(japonia);
            gripa.adaugareNod(rusia);
            gripa.adaugareNod(franta);
            gripa.adaugareNod(sua);
            gripa.adaugareNod(mexic);

            virus.adaugareNod(asia);
            virus.adaugareNod(europa);
            virus.adaugareNod(america);

            virus.descriere();



        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}