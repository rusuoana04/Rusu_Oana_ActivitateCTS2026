public class AplicatieCompanie {
        private String meci;
        private float pret;

    public AplicatieCompanie(String meci, float pret) {
        this.meci = meci;
        this.pret = pret;
    }



    public  void  rezervareBilet()
    {

        System.out.println("S-a rezervat biletul pentru meciul: "+ meci);
    }
    public void vanzareBilet()
    {
        System.out.println("S-a vandut biletul pentru meciul:  "+ meci+ ", avand peret: "+ pret);
    }
}
