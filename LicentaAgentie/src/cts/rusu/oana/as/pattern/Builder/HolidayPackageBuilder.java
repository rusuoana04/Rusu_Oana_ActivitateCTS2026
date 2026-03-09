package cts.rusu.oana.as.pattern.Builder;

public class HolidayPackageBuilder implements AbstractHolidayPackageBuild {

    boolean transportAvion;
    boolean transportAutocar;
    int durataCazare;
    boolean cameraSingle;
     boolean cameraDubla;
    boolean treiStele;
    boolean cinciStele;
     boolean excursiiGrup;
     boolean viziteMuzee;

    public HolidayPackageBuilder(int durataCazare) {
        this.durataCazare = durataCazare;

    }

    public HolidayPackageBuilder setTransportAvion(boolean transportAvion) {
        this.transportAvion = transportAvion;
        return this;
    }

    public HolidayPackageBuilder setTransportAutocar(boolean transportAutocar) {
        this.transportAutocar = transportAutocar;
        return this;
    }

    public HolidayPackageBuilder setDurataCazare(int durataCazare) {
        this.durataCazare = durataCazare;
        return this;
    }

    public HolidayPackageBuilder setCameraSingle(boolean cameraSingle) {
        this.cameraSingle = cameraSingle;
        return this;
    }

    public HolidayPackageBuilder setCameraDubla(boolean cameraDubla) {
        this.cameraDubla = cameraDubla;
        return this;
    }

    public HolidayPackageBuilder setTreiStele(boolean treiStele) {
        this.treiStele = treiStele;
        return this;
    }

    public HolidayPackageBuilder setCinciStele(boolean cinciStele) {
        this.cinciStele = cinciStele;
        return this;
    }

    public HolidayPackageBuilder setExcursiiGrup(boolean excursiiGrup) {
        this.excursiiGrup = excursiiGrup;
        return this;
    }

    public HolidayPackageBuilder setViziteMuzee(boolean viziteMuzee) {
        this.viziteMuzee = viziteMuzee;
        return this;
    }

    @Override
    public HolidayPackage build() {
        return new HolidayPackage(this);
    }
}
