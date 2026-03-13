package cts.rusu.oana.as.Factory;

public class FactoryProgramUscare implements Factory{
    @Override
    public IProgramSpalare creareProgram() {
        return new ProgramUscare();
    }
}
