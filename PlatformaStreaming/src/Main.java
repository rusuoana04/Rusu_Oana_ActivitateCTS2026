public class Main {
    public static void main(String[] args) throws Exception {
       IClip clip1=FactoryClip.creareClip(TipClip.LIVE, "clip1", 10);
        IClip clip2 = FactoryClip.creareClip(TipClip.LIVE, "Live2", 20);
        IClip clip3 = FactoryClip.creareClip(TipClip.TUTORIAL, "Java", 30);
        IClip clip4 = FactoryClip.creareClip(TipClip.TUTORIAL, "Spring", 40);
       System.out.println(clip1);
       clip1.descriere();
        System.out.println(clip2);
       clip2.descriere();
        System.out.println(clip3);
       clip3.descriere();
        System.out.println(clip4);
       clip4.descriere();


    }
}