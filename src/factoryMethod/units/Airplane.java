package factoryMethod.units;

public class Airplane implements Unit {
    @Override
    public void move() {
        System.out.println("Airplane is moving");
    }
    public void fly(){
        System.out.println("Airplane is flying");
    }
}
