package cts.rusu.oana.as.pattern.Prototype;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Jucator implements IJucator{
    private String tipJucator;
    private String tipSport;
    private String medicament;
    private List<String> antrenamente;
    private List<String>  medicamenteInterzise;

    public Jucator(String tipJucator, String tipSport, String medicament, List<String> antrenamente, List<String> medicamenteInterzise) {
        this.tipJucator = tipJucator;
        this.tipSport = tipSport;
        this.medicament=medicament;
        this.antrenamente = antrenamente;
        this.medicamenteInterzise = medicamenteInterzise;
    }

    public Jucator() {
    }

    @Override
    public IJucator copy() {
        Jucator copy= new Jucator();
        copy.tipJucator=this.tipJucator;
        copy.tipSport=this.tipSport;
        copy.medicament=this.medicament;
        copy.antrenamente=new ArrayList<>(this.antrenamente);
        copy.medicamenteInterzise=new ArrayList<>(this.medicamenteInterzise);
        return copy;


    }

    public List<String> getAntrenamente() {
        return antrenamente;
    }

    public List<String> getMedicamenteInterzise() {
        return medicamenteInterzise;
    }

    public void setAntrenamente(List<String> antrenamente) {
        this.antrenamente = antrenamente;
    }

    public void setMedicamenteInterzise(List<String> medicamenteInterzise) {
        this.medicamenteInterzise = medicamenteInterzise;
    }

    @Override
    public void testareJucator(String medicament) {
    if(medicamenteInterzise.contains(medicament))
    {
        System.out.println("Jucatorul a fost testat pozitiv anti doping la  "+ medicament);
    }
    else
    {
        System.out.println("Jucatorul a fost testat negativ anti doping la  "+ medicament);
    }
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "tipJucator='" + tipJucator + '\'' +
                ", tipSport='" + tipSport + '\'' +
                ", medicament='" + medicament + '\'' +
                ", antrenamente=" + antrenamente +
                ", medicamenteInterzise=" + medicamenteInterzise +
                '}';
    }
}
