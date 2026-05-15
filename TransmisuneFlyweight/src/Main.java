import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista=new ArrayList<>();
        lista.add("comentariu1");
        lista.add("comentariu2");
        List<String> lista1=new ArrayList<>();
        lista1.add("comentariu3");
        lista1.add("comentariu4");
        List<String> lista3=new ArrayList<>();
        lista3.add("comentariu5");
        lista3.add("comentariu6");

        FabricaDeEvenimente fabricaDeEvenimente=new FabricaDeEvenimente();
        DetaliiTransmisiuneLive detaliiTransmisiuneLive=new DetaliiTransmisiuneLive("instagram", lista);
        DetaliiTransmisiuneLive d2=new DetaliiTransmisiuneLive("facebook", lista1);
        DetaliiTransmisiuneLive d3=new DetaliiTransmisiuneLive("tiktok", lista3);


//        detaliiTransmisiuneLive.setListaComentarii(lista);
//        d2.setListaComentarii(lista1);
//        d3.setListaComentarii(lista3);

        ITransmisiune eveniment= fabricaDeEvenimente.getEveniment("dinamo",90);



        eveniment.detaliiTransmisiune(detaliiTransmisiuneLive);
        eveniment.detaliiTransmisiune(d2);
        eveniment.detaliiTransmisiune(d3);
        System.out.println(fabricaDeEvenimente.getNrEvenimente());





    }
}