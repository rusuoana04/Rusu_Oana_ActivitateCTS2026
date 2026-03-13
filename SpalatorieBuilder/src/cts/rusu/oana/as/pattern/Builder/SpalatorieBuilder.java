package cts.rusu.oana.as.pattern.Builder;

public class SpalatorieBuilder implements Builder{
    boolean inrareTunel=true;
     boolean trecereZonaSpalare=true;
    boolean zonaPerii=true;
    boolean zonaCeruire=true;
     boolean zonaUscare=true;
     boolean aspirareInterior;
   String odorizantInterior;



    public SpalatorieBuilder setAspirareInterior(boolean aspirareInterior) {
        this.aspirareInterior = aspirareInterior;
        return this;
    }

    public SpalatorieBuilder setOdorizantInterior(String odorizantInterior) {
        this.odorizantInterior = odorizantInterior;
        return this;
    }


    @Override
    public Spalatorie build() {
        return new Spalatorie(this);
    }
}
