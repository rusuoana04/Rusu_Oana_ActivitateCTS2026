package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Builder.ETipMaterial;
import cts.rusu.oana.as.pattern.Builder.ETipPantof;
import cts.rusu.oana.as.pattern.Builder.Pantof;
import cts.rusu.oana.as.pattern.Builder.PantofBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Pantof pantof=new PantofBuilder(ETipPantof.ghete, 36, 10, ETipMaterial.pieleNaturala).setListaMesajeText(new ArrayList<>(List.of("Marimea 36", "Piele naturala"))).build();
        pantof.addMaterial(ETipMaterial.pieleEcologica);
        Pantof pantof2=new PantofBuilder(ETipPantof.tenisi, 38, 10, ETipMaterial.pieleEcologica).setListaMesajeText(new ArrayList<>(List.of("Marimea 36", "Piele naturala"))).build();


        System.out.println(pantof);
        System.out.println(pantof2);
    }
}