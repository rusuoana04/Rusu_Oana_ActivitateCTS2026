public class Main {
    public static void main(String[] args) throws Exception {

        Optiune meniu=new Categorie("Sectiune","Meniu");
        Optiune startere=new Categorie("Sectiune", "Startere");
        Optiune bauturi=new Categorie("Sectiune", "Bauturi");
        Optiune desert=new Categorie("Sectiune", "Desert");

        Optiune micDejun=new Categorie("Subsectiune ", "Mic Dejun");
        Optiune pranz=new Categorie("Subsectiune ", "Pranz ");


        Optiune sucuri=new Categorie("Subsectiune ", "Sucuri");
        Optiune cafea=new Categorie("Subsectiune ", "Cafea");
        Optiune apa=new Categorie("Subsectiune ", "Apa");

        Optiune desertNormal=new Categorie("Subsectiune ", "Desert Normal");
        Optiune desertVegan=new Categorie("Subsectiune ", "Desert Vegan");

        Optiune omleta=new Item("Item", "Omleta");
        Optiune ouaPosate=new Item("Item", "ouaPosate");

        Optiune icre=new Item("Item", "Icre");
        Optiune humus=new Item("Item", "Humus");

        Optiune limonada=new Item("Item", "Limonada");
        Optiune sucPortocale=new Item("Item", "Suc Portocale");

        Optiune cafeaLapte=new Item("Item", "Cafea Lapte");
        Optiune americano=new Item("Item", "Americano");

        Optiune apaPlata=new Item("Item", "Apa Plata");
        Optiune apaMinerala=new Item("Item", "Apa Minerala");

        Optiune inghetata=new Item("Item", "Inghetata");
        Optiune tiramisu=new Item("Item", "Tiramisu");
        Optiune bananaBread=new Item("Item", "banana Bread");
        Optiune budincaChia=new Item("Item", "Budinca Chia");




        try {
            startere.adaugareNod(micDejun);
            startere.adaugareNod(pranz);

            bauturi.adaugareNod(sucuri);
            bauturi.adaugareNod(cafea);
            bauturi.adaugareNod(apa);

            desert.adaugareNod(desertNormal);
            desert.adaugareNod(desertVegan);





            micDejun.adaugareNod(omleta);
            micDejun.adaugareNod(ouaPosate);

            pranz.adaugareNod(icre);
            pranz.adaugareNod(humus);

            sucuri.adaugareNod(sucPortocale);
            sucuri.adaugareNod(limonada);

            cafea.adaugareNod(cafeaLapte);
            cafea.adaugareNod(americano);

            apa.adaugareNod(apaPlata);
            apa.adaugareNod(apaMinerala);

            desertNormal.adaugareNod(inghetata);
            desertNormal.adaugareNod(tiramisu);

            desertVegan.adaugareNod(bananaBread);
            desertVegan.adaugareNod(budincaChia);



            meniu.adaugareNod(startere);
            meniu.adaugareNod(bauturi);
            meniu.adaugareNod(desert);
            meniu.descriere();

            System.out.println();
            System.out.println("Stergere nod sectie Desert");
            System.out.println();
            meniu.stergereNod(desert);
            meniu.descriere();
            System.out.println();
            System.out.println("Readaugare nod sectie Desert");
            System.out.println();
            meniu.adaugareNod(desert);
            meniu.descriere();

            System.out.println();
            System.out.println("Apelare mdetoda getNod");
            System.out.println(meniu.getNod(1));





        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}