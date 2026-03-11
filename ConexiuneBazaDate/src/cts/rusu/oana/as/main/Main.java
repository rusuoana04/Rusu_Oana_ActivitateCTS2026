package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Singleton.Conexiune;

public class Main {
    public static void main(String[] args) {
        Conexiune conexiune=Conexiune.getInstance();
        Conexiune conexiune1=Conexiune.getInstance();
            System.out.println("Thread principal: ");
        System.out.println(conexiune.hashCode());
        System.out.println(conexiune1.hashCode());

        Thread thread=new Thread(()-> {
            System.out.println("Thread secundar: ");
            Conexiune conexiune2=Conexiune.getInstance();
            System.out.println(conexiune2.hashCode());
        });
        thread.start();



    }
}