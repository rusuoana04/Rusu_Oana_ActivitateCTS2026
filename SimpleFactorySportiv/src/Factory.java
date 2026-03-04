

public class Factory {
    public IJucator creareJucator(TipJucator tipJucator) throws Exception {
        switch (tipJucator)
        {
            case Portar:
                return new JucatorPortar();
            case Fundas:
                return new JucatorFundas();
            case Atacant:
                return new JucatorAtacant();
            default:
                throw new Exception("Eroare creare jucator");

        }
    }
}
