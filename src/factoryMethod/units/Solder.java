package factoryMethod.units;

public class Solder implements Unit {

    @Override
    public void move() {
        System.out.println("Solder is moving!");
    }
    public void fight(){
        System.out.println("Attack!");
    }
}
