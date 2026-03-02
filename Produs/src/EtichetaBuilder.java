public class EtichetaBuilder implements IBuilder{
     String  dataExpirare="";
     String importator="";;
     String ingrediente="";;
     String gramaj="";;
     String fibre="";;
     String proteine="";;
     String sare="";;

    public EtichetaBuilder() {
        this.dataExpirare = dataExpirare;
        this.importator = importator;
        this.ingrediente = ingrediente;
        this.gramaj = gramaj;
        this.fibre = fibre;
        this.proteine = proteine;
        this.sare = sare;
    }

    public EtichetaBuilder setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
        return this;
    }

    public EtichetaBuilder setImportator(String importator) {
        this.importator = importator;
        return this;
    }

    public EtichetaBuilder setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
        return this;
    }

    public EtichetaBuilder setGramaj(String gramaj) {
        this.gramaj = gramaj;
        return this;
    }

    public EtichetaBuilder setFibre(String fibre) {
        this.fibre = fibre;
        return this;
    }

    public EtichetaBuilder setProteine(String proteine) {
        this.proteine = proteine;
        return this;
    }

    public EtichetaBuilder setSare(String sare) {
        this.sare = sare;
        return this;
    }

    @Override
    public Eticheta build() {
        return new Eticheta(this);
    }
}
