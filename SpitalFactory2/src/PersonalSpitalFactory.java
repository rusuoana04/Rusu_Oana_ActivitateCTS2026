public class PersonalSpitalFactory {
    public PersonalSpital crearePersonal(TipPersonal tipPersonal) throws Exception {
        switch (tipPersonal)
        {
            case Brancardier:
                return  new PersonalBrancardier();
            case Asistent:
                return  new PersonalAsistent();
            case Medic:
                return new PersonalMedic();
            case Secretar:
                return new PersonalSecretar();
            case Registrator:
                return  new PersonalRegistrator();
            default:
                throw new Exception("Eroare creare Personal Spital");
        }
    }
}
