import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CameraCurata {
    private int codCamera;

    private List<Integer> camereCurate=new ArrayList<>();

    public CameraCurata(int codCamera) {
        this.codCamera = codCamera;
        camereCurate.add(2);
        camereCurate.add(3);


    }

    @Override
    public String toString() {
        return "CameraCurata{" +
                "codCamera=" + codCamera +
                '}';
    }

    public boolean cameraCurata()
    {
        if(camereCurate.contains(codCamera))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
