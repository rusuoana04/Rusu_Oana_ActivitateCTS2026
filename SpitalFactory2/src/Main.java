public class Main {
    public static void main(String[] args) {
        PersonalSpitalFactory personalSpitalFactory=new PersonalSpitalFactory();
        PersonalSpital personalSpital=null;
        try {
            personalSpital=personalSpitalFactory.crearePersonal(TipPersonal.Secretar);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        personalSpital.descriere();

    }
}