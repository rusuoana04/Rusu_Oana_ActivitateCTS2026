public class FactoryComponenta {
    public IComponenta creareComponenta(TipComponenta tipComponenta) throws Exception {
        switch (tipComponenta)
        {
            case Usa:
                return new ComponentaUsa();
            case Capota:
                return  new ComponentaCapota();
            case Bara:
                return new ComponentaBara();
            case Portbagaj:
                return new ComponentaPortbagaj();
            default:
                throw new Exception("Eroare");
        }
    }
}
