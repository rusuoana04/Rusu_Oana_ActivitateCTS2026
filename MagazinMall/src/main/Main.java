package main;

import clase.Magazin;
import clase.MagazinBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        Magazin magazin=new MagazinBuilder("magazin1", 100).build();
        System.out.println(magazin);
    }
}