public class FactorySupa {
    public ISupa creareSupa(TipSupa tipSupa) throws Exception {
        switch (tipSupa)
        {
            case supaciuperci:
                return new SupaCiuperci();
            case supalegume:
                return new SupaLegume();
            case supavita:
                return  new SupaVita();
            default:
                throw new Exception("Eroare creare supa");
        }
    }
}
