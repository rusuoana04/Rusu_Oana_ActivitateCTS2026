package cts.rusu.oana.as.pattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class PantofBuilder implements Builder{
    ETipPantof tipPantof;
    int nrPantof;
    float dimensiuneToc;
    ETipMaterial material;
    List<ETipMaterial> materialeSuplimentare=new ArrayList<>();
    List<String> listaMesajeText=new ArrayList<>();

    public  PantofBuilder(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) throws Exception {
        this.tipPantof=tipPantof;
        if(nrPantof<35 || nrPantof>45)
        {
            throw new Exception("Dimenisiunea eronata- selectati o dimensiune intre 35-45");
        }
        else
        {
            this.nrPantof = nrPantof;
        }
        if(dimensiuneToc<1|| dimensiuneToc>12)
        {
            throw new Exception("Dimenisiune toc eronata");
        }
        this.dimensiuneToc=dimensiuneToc;
        this.material=material;
    }





    public PantofBuilder setMaterialeSuplimentare(List<ETipMaterial> materialeSuplimentare) {
        this.materialeSuplimentare = materialeSuplimentare;
        return this;
    }

    public PantofBuilder setListaMesajeText(List<String> listaMesajeText) {
        this.listaMesajeText = listaMesajeText;
        return this;
    }

    @Override
    public Pantof build() throws Exception {
        return new Pantof(this);
    }
}
