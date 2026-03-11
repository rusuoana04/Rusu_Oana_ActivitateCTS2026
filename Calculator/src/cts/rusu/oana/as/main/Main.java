package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Builder.Calculator;
import cts.rusu.oana.as.pattern.Builder.CalculatorBuilder;

public class Main {
    public static void main(String[] args) {

        Calculator calculator=new CalculatorBuilder("Intel", 512, 64).setPlacaVideo(true).setSistemRacire(true).build();

        System.out.println(calculator);
    }
}