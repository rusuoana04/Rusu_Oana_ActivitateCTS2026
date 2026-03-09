public class Main {
    public static void main(String[] args) throws Exception {


       AbstractTurismLicence licence=LicentaTurism.getInstance();
       AbstractTurismLicence licena1=LicentaTurism.getInstance();

       licence.setLicenceNumber(100);
       System.out.println(licence);
        System.out.println(licena1);

        System.out.println(licena1==licence);

        licence.setLicenceNumber(200);

    }
}