package cts.rusu.oana.as.Factory;

public class FactoryProgramZonaPerii implements Factory{
    @Override
    public IProgramSpalare creareProgram() {
        return new ProgramZonaPerii();
    }
}
