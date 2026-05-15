public class Main {
    public static void main(String[] args)

    {
        Optiune magazin=new Categorie("Magazin");
        Optiune bax=new Categorie("Bax1");
        Optiune bax1=new Categorie("Bax2");

        Optiune cutie=new Subcategorie("Cutia1");
        Optiune cutie2=new Subcategorie("Cutia2");
        Optiune cuti3=new Subcategorie("Cutia3");
        Optiune cuti4=new Subcategorie("Cutia4");

        Optiune cartofi=new Item("Cartofi", 10,100);
        Optiune orez=new Item("Orez", 20,200);
        Optiune faina=new Item("Faina", 5,50);

        try {
            bax.adaugareNod(cutie);
            bax.adaugareNod(cutie2);
            bax1.adaugareNod(cuti3);
            bax1.adaugareNod(cuti4);

            cutie.adaugareNod(cartofi);
            cutie2.adaugareNod(orez);
            cuti3.adaugareNod(faina);
            cuti4.adaugareNod(cartofi);

            magazin.adaugareNod(bax);
            magazin.adaugareNod(bax1);
            magazin.descriere();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("Hello, World!");
    }
}