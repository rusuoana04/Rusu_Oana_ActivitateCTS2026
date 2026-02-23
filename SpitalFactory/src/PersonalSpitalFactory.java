public class PersonalSpitalFactory {
  public PersonalSpital crearePersonal(TipPersonal tipPersonal) throws Exception {
      switch (tipPersonal)
      {
          case Brancardier:
              return  new PersonalBrancardier();
          case Asistent:
              return new PersonalAsistent();
          case Medic:
              return new PersonalMedic();
          default:
              throw new Exception("Eroare creare perosnal");
      }
  }


}
