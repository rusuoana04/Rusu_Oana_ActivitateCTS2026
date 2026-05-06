public class Facade {
    public void verificareClient(boolean reteta,int cantitate, boolean card )
    {
        RetetaClient retetaClient=new RetetaClient(reteta );
        StocMedicamente stocMedicamente=new StocMedicamente(cantitate);
        CardFidelitate cardFidelitate=new CardFidelitate(card);
        System.out.println("Clientul are reteta? "+retetaClient.verificareReteta());
        System.out.println("Medicamentul e in stoc? "+stocMedicamente.verificareStoc(50));
        System.out.println("Clientul are card de fidelitate? "+cardFidelitate.verificareCard());

        if(retetaClient.verificareReteta()&& stocMedicamente.verificareStoc(50)&& cardFidelitate.verificareCard()==true)
        {
            System.out.println("Se poate achizitiona medicamentul");
        }
        else
        {
            System.out.println("Nu se poate achizitiona medicamentul");
        }
    }
}
