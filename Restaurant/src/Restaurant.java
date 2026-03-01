public class Restaurant
{
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    public Restaurant(boolean asezareGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzicaAmbientalaPersonalizata, boolean genMuzica) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public boolean isAsezareGeam() {
        return asezareGeam;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public boolean isDecorareaMesei() {
        return decorareaMesei;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public boolean isMuzicaAmbientalaPersonalizata() {
        return muzicaAmbientalaPersonalizata;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public boolean isGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "asezareGeam=" + asezareGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareaMesei=" + decorareaMesei +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica=" + genMuzica +
                '}';
    }
}
