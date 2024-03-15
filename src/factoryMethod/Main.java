package factoryMethod;

public class Main {
    static UnitHandler unitHandler;
    public static void configure(String ext){
        unitHandler = new UnitHandlerImpl(ext);
    }
    public static void main(String[] args) {
        configure("zona costera");
        unitHandler.processUnit();

        configure("zona boscosa");
        unitHandler.processUnit();

        configure("zona urbana");
        unitHandler.processUnit();

    }
}
