package AbstractFactory;

public interface FactoryFeluriMancare {
    IDesert creareDesert(EDesert tipDesert) throws Exception;
    ISupa creareSupa(ESupa tipSupa) throws Exception;
}
