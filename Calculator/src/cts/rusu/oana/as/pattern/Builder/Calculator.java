package cts.rusu.oana.as.pattern.Builder;

public class Calculator {
    private final String procesor;
    private final int memorieRAM;
    private final int placaDeBaza;
    private final boolean placaVideo;
    private final boolean SSDsuplimentar;
    private final boolean sistemRacire;



    public Calculator(CalculatorBuilder builder) {
        this.procesor = builder.procesor;
        this.memorieRAM = builder.memorieRAM;
        this.placaDeBaza = builder.placaDeBaza;
        this.placaVideo = builder.placaVideo;
        this.SSDsuplimentar = builder.SSDsuplimentar;
        this.sistemRacire = builder.sistemRacire;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "procesor='" + procesor + '\'' +
                ", memorieRAM=" + memorieRAM +
                ", placaDeBaza=" + placaDeBaza +
                ", placaVideo=" + placaVideo +
                ", SSDsuplimentar=" + SSDsuplimentar +
                ", sistemRacire=" + sistemRacire +
                '}';
    }
}
