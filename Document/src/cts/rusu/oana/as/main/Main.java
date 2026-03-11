package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Prototype.Document;

public class Main {
    public static void main(String[] args) {

        Document document=new Document("Document1", "continut1", "font1", "stanga");
        Document document1= (Document) document.copy();

        System.out.println(document);
        System.out.println(document1);
        document1.setTitlu("Titlu2");
        document1.setContinut("Continut2");
        System.out.println(document1);


    }
}