public class Proxy implements ICredit{
    private Credit credit;

    public Proxy(Credit credit) {
        this.credit = credit;
    }

    public Proxy(Client client) {
        this.credit=new Credit(client);
    }

    @Override
    public void descriere() {
        credit.descriere();
    }

    @Override
    public void creareCont() {
        System.out.println("S-a solicitat crearea unui cont de credit");
        if(credit.getClient().isContRon()==true)
        {
            System.out.println("S-a realizat crearea contului de credit in RON pentru clientul: "+credit.getClient().getNumeClient());
        }
        else
        {
            System.out.println("Nu se poate crea contul de credit  pentru clientul: "+credit.getClient().getNumeClient()+" deoarece banca poate crea doar credite in RON");
        }
    }
}
