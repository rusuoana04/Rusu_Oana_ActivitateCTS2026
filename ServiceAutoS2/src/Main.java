public class Main {
    public static void main(String[] args) {
        FactoryComponenta factory=new FactoryComponenta();
        IComponenta componentaColantata=null;
        try {
            componentaColantata=factory.creareComponenta(TipComponenta.Bara);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        componentaColantata.descriere();
    }
}