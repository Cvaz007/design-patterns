package factoryMethod;

public class Main {
    static UnitHandler unitHandler;
    public static void configure(String ext){
        unitHandler = new UnitHandlerImpl(ext);
    }
    public static void main(String[] args) {
        configure("tank");
        unitHandler.processUnit();

        configure("airplane");
        unitHandler.processUnit();

        configure("solder");
        unitHandler.processUnit();

    }
}
