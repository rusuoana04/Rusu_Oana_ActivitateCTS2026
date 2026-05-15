public class Eveniment implements ITransmisiune{
    private String numeEveniment;
    private int durata;

    public Eveniment(String numeEveniment, int durata) {
        this.numeEveniment = numeEveniment;
        this.durata = durata;
    }

    @Override
    public void detaliiTransmisiune(DetaliiTransmisiuneLive detaliiTransmisiuneLive) {
        System.out.println("Evenimentul cu numele: "+ numeEveniment+ ", durata: "+ durata+ " este transmis live pe platforma "+ detaliiTransmisiuneLive.getPlatforma()+ " avand comentarii "+ detaliiTransmisiuneLive.getListaComentarii());
    }
}
