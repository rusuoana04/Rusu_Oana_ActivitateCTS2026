public class Facade {
    public void verificareClient(int varsta, boolean cazier, boolean creante)
    {
        VarstaClient varstaClient=new VarstaClient(varsta);
        CazierClient cazierClient=new CazierClient(cazier);
        CreanteClient creanteClient=new CreanteClient(creante);

        System.out.println( "Client major? "+varstaClient.verificareVarsta(18));

        System.out.println( "Are cazier? "+cazierClient.verificareCazier());

        System.out.println( "Are creante la alte banci? "+creanteClient.verificareCreante());


        if(varstaClient.verificareVarsta(18)==true && cazierClient.verificareCazier()==false&&creanteClient.verificareCreante()==false)
        {
            System.out.println("Se poate crea contul de client");
        }
        else
        {
            System.out.println("Nu se poate crea contul de client");
        }


    }
}
