public class CardBancar implements ModValidare{
    @Override
    public void validareCalatorie(int nrBilet, double suma) {
        System.out.println("S-a validat calatoria cu card bancar cu nr bilet "+ nrBilet+ " si suma de "+suma+ " RON");
    }
}
