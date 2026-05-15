public interface IClip {
    void  adaugaNod(IClip iClip) throws Exception;
    void stergeNod(IClip iClip) throws Exception;
    IClip getNod(int index) throws Exception;
    void  decriere();
}
