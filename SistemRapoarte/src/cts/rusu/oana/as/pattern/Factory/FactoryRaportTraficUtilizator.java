package cts.rusu.oana.as.pattern.Factory;

public class FactoryRaportTraficUtilizator implements Factory{
    @Override
    public IRaport creareRaport() {
        return new RaportTraficUtilizator();
    }
}
