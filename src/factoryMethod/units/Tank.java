package factoryMethod.units;

public class Tank implements Unit {
    @Override
    public void move() {
        System.out.println("Tank is moving!");
    }
    public void fire(){
        System.out.println("Friendly fire!");
    }
}
