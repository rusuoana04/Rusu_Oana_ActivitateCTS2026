public class ContClientBuilder implements Builder {
    boolean hasSalariu;
    boolean hasCardAtasat;
    boolean hasInternetBanking;

    ContClient cont;

    public ContClientBuilder()
    {
        cont=new ContClient(false, false, false);
    }

    public ContClientBuilder setHasSalariu(boolean hasSalariu) {
        this.cont.setHasSalariu(hasSalariu);
        return this;
    }

    public ContClientBuilder setHasCardAtasat(boolean hasCardAtasat) {
        this.cont.setHasCardAtasat(hasCardAtasat);
        return this;
    }

    public ContClientBuilder setHasInternetBanking(boolean hasInternetBanking) {
        this.cont.setHasInternetBanking(hasInternetBanking);
        return this;
    }


    @Override
    public ContClient build() {
        return cont;
    }
}
