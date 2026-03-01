package AbstractFactory;

public class Factory implements  FactoryFeluriMancare{

    @Override
    public  IDesert creareDesert(EDesert tipDesert) throws Exception {
        switch (tipDesert)
        {
            case Papanasi:
                return  new DesertPapanasi();
            case Clatite:
                return new DesertClatita();
            case CheeseCake:
                return new DesertCheeseCake();
            default:
                throw new Exception("Eroare");
        }
    }

    @Override
    public ISupa creareSupa(ESupa tipSupa) throws Exception {
        switch (tipSupa)
        {
            case supalegume:
                return  new SupaLegume();
            case supaciuperci:
                return new SupaCiuperci();
            case supavita:
                return new SupaVita();
            default:
                throw new Exception("Eroare");
        }
    }
}
