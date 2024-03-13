package factoryMethod;

import factoryMethod.units.Airplane;
import factoryMethod.units.Solder;
import factoryMethod.units.Tank;
import factoryMethod.units.Unit;

public class UnitHandlerImpl extends UnitHandler{
    public UnitHandlerImpl(String type) {
        super(type);
    }

    @Override
    public Unit createUnit(String type) {
        if (type.equalsIgnoreCase("solder")){
            return new Solder();
        }else if (type.equalsIgnoreCase("tank")){
            return new Tank();
        }else if (type.equalsIgnoreCase("airplane")){
            return new Airplane();
        }else return null;
    }
}
