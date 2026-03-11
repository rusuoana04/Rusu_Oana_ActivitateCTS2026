package cts.rusu.oana.as.pattern.Builder;

import java.util.List;

public class Pantof extends APantof{
    private final ETipPantof tipPantof;
    private final int nrPantof;
    private final float dimensiuneToc;
    private final ETipMaterial material;
    private final List<ETipMaterial> materialeSuplimentare;
    private final List<String> listaMesajeText;


    public Pantof(PantofBuilder builder) throws Exception {

        this.tipPantof = builder.tipPantof;

        this.nrPantof = builder.nrPantof;
        this.dimensiuneToc = builder.dimensiuneToc;
        this.material = builder.material;
        this.materialeSuplimentare = builder.materialeSuplimentare;
        this.listaMesajeText = builder.listaMesajeText;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", nrPantof=" + nrPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", material=" + material +
                ", materialeSuplimentare=" + materialeSuplimentare +
                ", listaMesajeText=" + listaMesajeText +
                '}';
    }


    @Override
    public float calculPret() {
        return 0;
    }

    @Override
    public void addMesaj(String mesaj) {
       this.listaMesajeText.add(mesaj);
    }

    @Override
    public void addMaterial(ETipMaterial tipMaterial) {
        this.materialeSuplimentare.add(tipMaterial);
    }
}
