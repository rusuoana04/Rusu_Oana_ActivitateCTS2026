package cts.rusu.oana.as.pattern.Factory;

public class FactoryRaportFinanciar implements Factory{
    @Override
    public IRaport creareRaport() {
        return new RaportFinanciar();
    }
}
