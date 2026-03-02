public class Eticheta implements IEticheta {
    private String  dataExpirare;
    private String importator;
    private String ingrediente;
    private String gramaj;
    private String fibre;
    private String proteine;
    private String sare;



    public Eticheta(EtichetaBuilder builder)
    {
        this.dataExpirare=builder.dataExpirare;
        this.importator=builder.importator;
        this.ingrediente=builder.ingrediente;
        this.gramaj=builder.gramaj;
        this.fibre=builder.fibre;
        this.proteine=builder.proteine;
        this.sare=builder.sare;
    }


    @Override
    public void printareMesaj() {
        System.out.println("Eticheta: {" +
                "dataExpirare='" + dataExpirare + '\'' +
                ", importator='" + importator + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", gramaj='" + gramaj + '\'' +
                ", fibre='" + fibre + '\'' +
                ", proteine='" + proteine + '\'' +
                ", sare='" + sare + '\'' +
                '}');
    }
}
