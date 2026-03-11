package cts.rusu.oana.as.pattern.Prototype;

public class Document implements IDocument{
    private String titlu;
    private String continut;
    private String font;
    private String aliniere;


    public Document(String titlu, String continut, String font, String aliniere) {
        this.titlu = titlu;
        this.continut = continut;
        this.font = font;
        this.aliniere = aliniere;
    }

    public Document() {
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }


    @Override
    public IDocument copy() {
        Document copy=new Document();
        copy.font=this.font;
        copy.aliniere=this.aliniere;
        return  copy;
    }

    @Override
    public String toString() {
        return "Document{" +
                "titlu='" + titlu + '\'' +
                ", continut='" + continut + '\'' +
                ", font='" + font + '\'' +
                ", aliniere='" + aliniere + '\'' +
                '}';
    }
}
