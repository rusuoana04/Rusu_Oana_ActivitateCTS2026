package main;

import clase.Magazin;
import clase.MagazinBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        Magazin magazin=new MagazinBuilder("magazin1", 100).build();
        Magazin magazin1=new MagazinBuilder("Magazin1", 200).setNrIntrari(2).setTipPodea("Lemn").build();
        System.out.println(magazin);
        System.out.println(magazin1);
    }
}