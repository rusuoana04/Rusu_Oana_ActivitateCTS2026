package cts.rusu.oana.as.Factory;

public class FactoryProgramPrespalare implements Factory{
    @Override
    public IProgramSpalare creareProgram() {
        return new ProgramPrespalare();
    }
}
