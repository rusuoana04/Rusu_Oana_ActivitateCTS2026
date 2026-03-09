package cts.rusu.oana.as.pattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Webinar implements IWebinar{
    private  String numeWebinar;
    private int durata;
    private String titlu;
    private String descriere;
    private List<String> comentarii;

    public Webinar(String numeWebinar, int durata, String titlu, String descriere, List<String> comentarii) {
        this.numeWebinar = numeWebinar;
        this.durata = durata;
        this.titlu = titlu;
        this.descriere = descriere;
        this.comentarii = comentarii;
    }

    public Webinar() {
    }

    public String getTitlu() {
        return titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public List<String> getComentarii() {
        return comentarii;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setComentarii(List<String> comentarii) {
        this.comentarii = comentarii;
    }

    @Override
    public IWebinar copy() {
        Webinar copy=new Webinar();
        copy.numeWebinar=this.numeWebinar;
        copy.durata=this.durata;
        return copy;


    }

    @Override
    public String toString() {
        return "Webinar{" +
                "numeWebinar='" + numeWebinar + '\'' +
                ", durata=" + durata +
                ", titlu='" + titlu + '\'' +
                ", descriere='" + descriere + '\'' +
                ", comentarii=" + comentarii +
                '}';
    }
}
