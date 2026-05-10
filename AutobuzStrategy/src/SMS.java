public class SMS implements ModValidare{
    @Override
    public void validareCalatorie(int nrBilet, double suma) {
        System.out.println("S-a validat calatoria prin sms cu nr bilet: "+ nrBilet+ " cu suma de "+ suma+ " RON");
    }
}
