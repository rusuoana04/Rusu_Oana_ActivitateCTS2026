package cts.rusu.oana.as.Factory;

public class FactoryProgramPolishCeara implements Factory{
    @Override
    public IProgramSpalare creareProgram() {
        return new ProgramPolishCeara();
    }
}
