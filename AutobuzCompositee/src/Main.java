public class Main {
    public static void main(String[] args) {

        Optiune flota=new Categorie("Flota");
        Optiune autobuz=new Categorie("Autobuz");
        Optiune autocar=new Categorie("Autocar");

        Optiune grupMic=new Item("Grup mic", "Mercedes", "Model1", 10);
        Optiune grupMediu=new Item("Grup mediu", "Mercedes", "Model2", 30);
        Optiune grupMare=new Item("Grup mare", "BMW", "Model3", 60);

        try {
            autobuz.adaugareNod(grupMic);
            autobuz.adaugareNod(grupMediu);

            autocar.adaugareNod(grupMediu);
            autocar.adaugareNod(grupMare);

            flota.adaugareNod(autobuz);
            flota.adaugareNod(autocar);
            flota.descriere();

            flota.stergereNod(autobuz);
            flota.descriere();
            flota.adaugareNod(autobuz);
            flota.descriere();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("Hello, World!");
    }
}