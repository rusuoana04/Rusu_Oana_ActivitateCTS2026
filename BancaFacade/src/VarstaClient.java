public class VarstaClient {
    public int varsta;

    public VarstaClient(int varsta) {
        this.varsta = varsta;
    }

    public  boolean verificareVarsta(int varstaMajor)
    {
        if(varsta>=varstaMajor)
        {
          return   true;
        }
        else
        {
            return  false;
        }
    }
}
