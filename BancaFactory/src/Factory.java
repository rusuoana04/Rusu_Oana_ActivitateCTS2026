public class Factory {
    public ICredit creareCredit(TipCredit tipCredit) throws Exception {
        switch (tipCredit)
        {
            case nevoiPersonale:
                return  new CreditNevoiPersonale();
            case Ipotecar:
                return new CreditIpotecar();
            default:
                throw  new Exception("Eroare");
        }
    }
}
