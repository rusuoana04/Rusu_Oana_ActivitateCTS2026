package cts.rusu.oana.as.pattern.Builder;

public class CalculatorBuilder implements Builder{
     String procesor;
     int memorieRAM;
     int placaDeBaza;
     boolean placaVideo;
     boolean SSDsuplimentar;
     boolean sistemRacire;

     public  CalculatorBuilder(String procesor, int memorieRAM, int placaDeBaza)
     {
         this.procesor=procesor;
         this.memorieRAM=memorieRAM;
         this.placaDeBaza=placaDeBaza;
     }

    public CalculatorBuilder setPlacaVideo(boolean placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    public CalculatorBuilder setSSDsuplimentar(boolean SSDsuplimentar) {
        this.SSDsuplimentar = SSDsuplimentar;
        return this;
    }

    public CalculatorBuilder setSistemRacire(boolean sistemRacire) {
        this.sistemRacire = sistemRacire;
        return this;
    }

    @Override
    public Calculator build() {
        return new Calculator(this);
    }
}
