package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Prototype.IWebinar;
import cts.rusu.oana.as.pattern.Prototype.Webinar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Webinar webinar1=new Webinar("Webinar1", 60, "Secretele CTS", "implementare design patterns creationale", new ArrayList<>(List.of("Comentariu1", "Comentariu2")));
        Webinar webinar2= (Webinar) webinar1.copy();

        webinar2.setDescriere("implementare primul design pattern");
        webinar2.setComentarii(new ArrayList<>(List.of("Comentariul3", "Comentariul4")));
        System.out.println(webinar1);
        System.out.println(webinar2);
    }
}