package ToyFactory;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<Car> cars = new ArrayList<>();

    public void printProducts() {
        if (cars.size() == 0)
            System.out.println("Your Cart Is Empty Let's Shop !!!");

        else {
            for (Car car : cars)
                System.out.println(car);
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
