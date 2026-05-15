import java.util.ArrayList;
import java.util.List;

public class Playlist implements IClip{
     String nume;
     List<IClip> lista;


    public Playlist(String nume) {
        this.nume = nume;
        lista=new ArrayList<IClip>();
    }

    @Override
    public void adaugaNod(IClip iClip) {
        lista.add(iClip);
    }

    @Override
    public void stergeNod(IClip iClip) {
        lista.remove(iClip);
    }

    @Override
    public IClip getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void decriere() {
        System.out.println("Playlist "+ nume);
        for (IClip iClip: lista)
        {
            iClip.decriere();
        }
    }
}
