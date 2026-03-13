package cts.rusu.oana.as.pattern.Singleton;



public abstract class APreparat {
    private String numePreparat;
    private int timpGatire;

    public APreparat(String numePreparat, int timpGatire) {
        this.numePreparat = numePreparat;
        this.timpGatire = timpGatire;
    }

    String getNumePreparat()
    {
        return numePreparat;
    }
    int getTimpPreparat()
    {
        return timpGatire;
    }


}
