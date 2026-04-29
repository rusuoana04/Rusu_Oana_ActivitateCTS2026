import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int codCamera;
    private List<Integer> camereLibere=new ArrayList<>();



    public Camera(int codCamera) {
        this.codCamera = codCamera;
        camereLibere.add(1);
        camereLibere.add(2);
        camereLibere.add(4);
        camereLibere.add(10);

    }

    @Override
    public String toString() {
        return "Camera{" +
                "codCamera=" + codCamera +
                '}';
    }

    public boolean verificaCameraLibera()
    {
        if(camereLibere.contains(codCamera))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
