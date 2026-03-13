package cts.rusu.oana.as.main;

import cts.rusu.oana.as.Factory.Factory;
import cts.rusu.oana.as.Factory.FactoryProgramUscare;
import cts.rusu.oana.as.Factory.IProgramSpalare;

public class Main {
    public static void main(String[] args) {
        Factory factory=new FactoryProgramUscare();

        IProgramSpalare program=factory.creareProgram();
        program.descriereProgram();
    }
}