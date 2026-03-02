public class ClipuriTutorial implements IClip {
    private String nume;
    private int durata;

    public ClipuriTutorial(String nume, int durata) {
        this.nume = nume;
        this.durata = durata;
    }

    public ClipuriTutorial() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "ClipuriTutorial{" +
                "nume='" + nume + '\'' +
                ", durata=" + durata +
                '}';
    }

    @Override
    public void descriere() {
        System.out.println("Clipuri video tutorial");
    }
}
