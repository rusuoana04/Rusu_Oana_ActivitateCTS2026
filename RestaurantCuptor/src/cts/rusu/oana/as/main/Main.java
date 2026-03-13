package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Singleton.APreparat;
import cts.rusu.oana.as.pattern.Singleton.Cuptor;
import cts.rusu.oana.as.pattern.Singleton.ICuptor;
import cts.rusu.oana.as.pattern.Singleton.Preparat;

public class Main {
    public static void main(String[] args) {

        APreparat preparat=new Preparat("pulpa de pui", 60);
        ICuptor cuptor=Cuptor.getInstance();
        ICuptor cuptor1=Cuptor.getInstance();
        System.out.println(cuptor1==cuptor);
        cuptor.gatirePreparat(preparat);
        cuptor.finalizarePreparat();
    }
}