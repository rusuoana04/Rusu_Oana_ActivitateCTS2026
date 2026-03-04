public class ContClient {
    private boolean hasSalariu;
    private boolean hasCardAtasat;
    private boolean hasInternetBanking;

    public ContClient(boolean hasSalariu, boolean hasCardAtasat,boolean hasInternetBanking )
    {
        this.hasSalariu=hasSalariu;
        this.hasCardAtasat=hasCardAtasat;
        this.hasInternetBanking=hasInternetBanking;

    }

    public boolean isHasInternetBanking() {
        return hasInternetBanking;
    }

    public void setHasInternetBanking(boolean hasInternetBanking) {
        this.hasInternetBanking = hasInternetBanking;
    }

    public boolean isHasSalariu() {
        return hasSalariu;
    }

    public void setHasSalariu(boolean hasSalariu) {
        this.hasSalariu = hasSalariu;
    }

    public boolean isHasCardAtasat() {
        return hasCardAtasat;
    }

    public void setHasCardAtasat(boolean hasCardAtasat) {
        this.hasCardAtasat = hasCardAtasat;
    }

    @Override
    public String toString() {
        return "ContClient{" +
                "hasSalariu=" + hasSalariu +
                ", hasCardAtasat=" + hasCardAtasat +
                ", hasInternetBanking=" + hasInternetBanking +
                '}';
    }
}
