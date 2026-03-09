package cts.rusu.oana.as.pattern.Builder;

public class HolidayPackage {
    private final boolean transportAvion;
    private final boolean transportAutocar;
    private final int durataCazare;
    private final boolean cameraSingle;
    private final boolean cameraDubla;
    private final boolean treiStele;
    private final boolean cinciStele;
    private final boolean excursiiGrup;
    private final boolean viziteMuzee;

    public HolidayPackage(HolidayPackageBuilder builder)
    {
        this.transportAvion=builder.transportAvion;
        this.transportAutocar=builder.transportAutocar;
        this.durataCazare=builder.durataCazare;
        this.cameraSingle=builder.cameraSingle;
        this.cameraDubla=builder.cameraDubla;
        this.treiStele=builder.treiStele;
        this.cinciStele=builder.cinciStele;
        this.excursiiGrup=builder.excursiiGrup;
        this.viziteMuzee=builder.viziteMuzee;
    }

    @Override
    public String toString() {
        return "HolidayPackage{" +
                "transportAvion=" + transportAvion +
                ", transportAutocar=" + transportAutocar +
                ", durataCazare=" + durataCazare +
                ", cameraSingle=" + cameraSingle +
                ", cameraDubla=" + cameraDubla +
                ", treiStele=" + treiStele +
                ", cinciStele=" + cinciStele +
                ", excursiiGrup=" + excursiiGrup +
                ", viziteMuzee=" + viziteMuzee +
                '}';
    }
}
