package cts.rusu.oana.as.pattern.Factory;

public class FactoryRaportVanzari implements Factory{
    @Override
    public IRaport creareRaport() {
        return new RaportVanzari();
    }
}
