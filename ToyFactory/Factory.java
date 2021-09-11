package ToyFactory;

import java.util.ArrayList;

public class Factory {
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static final ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void showToysList() {
        if (cars.size() == 0)
            System.out.println("Toys List Is Empty Please Add Some...");

        else {
            for (Car car : cars)
                System.out.println(car);
        }
    }

    public void showCustomersCart(int id) {
        boolean isEmpty = true;
        for (Customer customer : customers) {
            if (customer.getId() == id){
                isEmpty = false;
                customer.getCart().printProducts();
                break;
            }
        }
        if (isEmpty)
            System.out.println("\nThere is no Customer With This Id ...\n");
    }

    public void buyToy(int customerId, int toyId) {
        boolean isEmptyCustomer = true;
        boolean isEmptyCar = true;
        outer: for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                isEmptyCustomer = false;
                for (Car car : cars) {
                    if (car.getId() == toyId) {
                        customer.getCart().addCar(car);
                        customer.minesBudget(car);
                        isEmptyCar = false;
                        break outer;
                    }
                }
            }
        }
        if (isEmptyCar)
            System.out.println("\nThere is no Toy With This Id ...\n");
        if (isEmptyCustomer)
            System.out.println("\nThere is no Customer With This Id ...\n");

    }

}
