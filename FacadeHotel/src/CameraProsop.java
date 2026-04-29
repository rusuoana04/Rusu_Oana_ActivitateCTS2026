import java.util.ArrayList;
import java.util.List;

public class CameraProsop {
    private int codCamera;
    private List<Integer> camereProsoape=new ArrayList<>();



    public CameraProsop(int codCamera) {
        this.codCamera = codCamera;
        camereProsoape.add(1);
        camereProsoape.add(2);
        camereProsoape.add(3);
    }





    public boolean verificaProsop()
    {
        if(camereProsoape.contains(codCamera))
        {
            return true;

        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "VerificaProsoape{" +
                "codCamera=" + codCamera +
                '}';
    }
}
