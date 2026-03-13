package cts.rusu.oana.as.pattern.Builder;

public class Spalatorie {
    private final boolean inrareTunel;
    private final boolean trecereZonaSpalare;
    private final boolean zonaPerii;
    private final boolean zonaCeruire;
    private final  boolean zonaUscare;
    private  final boolean aspirareInterior;
    private final String odorizantInterior;


    public Spalatorie(SpalatorieBuilder builder)
    {
        this.inrareTunel = builder.inrareTunel;
        this.trecereZonaSpalare = builder.trecereZonaSpalare;
        this.zonaPerii = builder.zonaPerii;
        this.zonaCeruire = builder.zonaCeruire;
        this.zonaUscare = builder.zonaUscare;
        this.aspirareInterior = builder.aspirareInterior;
        this.odorizantInterior = builder.odorizantInterior;
    }

    @Override
    public String toString() {
        return "Spalatorie{" +
                "inrareTunel=" + inrareTunel +
                ", trecereZonaSpalare=" + trecereZonaSpalare +
                ", zonaPerii=" + zonaPerii +
                ", zonaCeruire=" + zonaCeruire +
                ", zonaUscare=" + zonaUscare +
                ", aspirareInterior=" + aspirareInterior +
                ", odorizantInterior='" + odorizantInterior + '\'' +
                '}';
    }
}
