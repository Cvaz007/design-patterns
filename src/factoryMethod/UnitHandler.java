package factoryMethod;

import factoryMethod.units.Unit;

public abstract class UnitHandler {
    private final String type;

    public UnitHandler(String type) {
        this.type = type;
    }
    public abstract Unit createUnit(String type);
    public void processUnit(){
        Unit unit = this.createUnit(this.type);
        unit.move();
    }
}
