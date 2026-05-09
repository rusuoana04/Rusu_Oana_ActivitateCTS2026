public class Proxy implements IRezervare{
    private Rezervare rezervare;

    public Proxy(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public Proxy(Client client) {
        this.rezervare=new Rezervare(client);
    }

    @Override
    public void descriere() {
        rezervare.descriere();
    }

    @Override
    public void realizareRezervare() {
        if(rezervare.getClient().getNrPersoane()>=4)
        {
            System.out.println("S-a realizat rezervarea pentru "+ rezervare.getClient().getNume()+ " pentru un numar de "+rezervare.getClient().getNrPersoane()+ " persoane");
        }
        else
        {
            System.out.println("Nu s-a reazalizat rezervarea pentru "+ rezervare.getClient().getNume()+ " pentru un numar  de "+rezervare.getClient().getNrPersoane()+
                    " persoane. Va rugam sa veniti la restaurant, avem destule mese de  "+rezervare.getClient().getNrPersoane()+ " persoane, care nu necesita rezervare ");
        }
    }
}
