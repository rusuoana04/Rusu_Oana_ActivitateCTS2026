package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Prototype.Jucator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> antrenamente=new ArrayList<>(List.of("alergare", "flotari"));
        List<String>  medicamenteInterzise=new ArrayList<>(List.of("medicament1","medicament2"));
        Jucator jucator=new Jucator("Portar", "Fotbal","medicament1", antrenamente, medicamenteInterzise );
        Jucator jucator2=new Jucator("Fundas", "handbal", "medicament5", antrenamente, medicamenteInterzise);
        Jucator jucator1= (Jucator) jucator.copy();
        System.out.println(jucator);
        System.out.println(jucator1);
        System.out.println(jucator2);
//        antrenamente.add("rezistenta");
//        jucator1.setAntrenamente(antrenamente);
            jucator1.getAntrenamente().add("rezistenta");

        System.out.println(jucator1);

        jucator.testareJucator("medicament1");
        jucator2.testareJucator("medicament5");


    }
}