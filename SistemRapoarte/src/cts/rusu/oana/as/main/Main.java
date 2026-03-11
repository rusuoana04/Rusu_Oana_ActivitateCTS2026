package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Factory.Factory;
import cts.rusu.oana.as.pattern.Factory.FactoryRaportFinanciar;
import cts.rusu.oana.as.pattern.Factory.IRaport;
import cts.rusu.oana.as.pattern.Factory.RaportFinanciar;

public class Main {
    public static void main(String[] args) {

        Factory factory=new FactoryRaportFinanciar();
       IRaport raport1=factory.creareRaport();
        raport1.descriere();


    }
}