public class FactoryMasina {
    public static AMasina creareMasina(TipMasina tipMasina, String  nrInmatriculare) throws Exception {
        switch (tipMasina)
        {
            case SUV:

                return  new MasinaSUV(nrInmatriculare);
            case VAN:
                return  new MasinaVAN(nrInmatriculare);
            case SEDAN:
                return new MasinaSEDAN(nrInmatriculare);
            default:
                throw new Exception("Eroare");

        }


    }
}
