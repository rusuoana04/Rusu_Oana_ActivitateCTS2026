import java.util.ArrayList;
import java.util.List;

public class DetaliiTransmisiuneLive {
    private String platforma;
    private List<String> listaComentarii;


    public DetaliiTransmisiuneLive(String platforma, List<String> listaComentarii) {
        this.platforma = platforma;
        this.listaComentarii=listaComentarii;
    }

    public String getPlatforma() {
        return platforma;
    }

    public void setPlatforma(String platforma) {
        this.platforma = platforma;
    }

    public List<String> getListaComentarii() {
        return listaComentarii;
    }

    public void setListaComentarii(List<String> listaComentarii) {
        this.listaComentarii = listaComentarii;
    }


}
