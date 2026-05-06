public class BiletAdapter extends SistemBileteMetrou implements ValidareBilet{

    @Override
    public void validareBilet() {
        validareBiletMetrou();
    }
}
