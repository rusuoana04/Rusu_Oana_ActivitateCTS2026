package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Builder.Spalatorie;
import cts.rusu.oana.as.pattern.Builder.SpalatorieBuilder;

public class Main {
    public static void main(String[] args) {
        Spalatorie spalatorie= new SpalatorieBuilder().setOdorizantInterior("brad").build();

        System.out.println(spalatorie);
    }
}