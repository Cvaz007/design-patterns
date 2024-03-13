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
        if (type.equalsIgnoreCase("zona urbana")){
            return new Solder();
        }else if (type.equalsIgnoreCase("zona boscosa")){
            return new Tank();
        }else if (type.equalsIgnoreCase("zona costera")){
            return new Airplane();
        }else return null;
    }
}
