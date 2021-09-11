package ToyFactory;

public class Car extends Toy {

    public Car(String color, ToySize size, String name, int id) {
        super(color, size, name, id);
        Factory factory = new Factory();
        factory.addCar(this);
    }
}
