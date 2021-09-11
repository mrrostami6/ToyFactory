package ToyFactory;

import java.util.Locale;

public class Printer extends ConsoleScanner{
   private final Factory factory = new Factory();

    public boolean getMenuInput(){
        int order = super.getIntegerInput();
        switch (order){
            case 1:
                addToy();
                break;

            case 2:
                buyToy();
                break;

            case 3:
                factory.showToysList();
                break;

            case 4:
                showCustomersCart();
                break;

            case 5:
                printBudget();
                break;

            case 6:

                return false;
            default:
                System.out.println("Please Enter a valid number");
        }
        return true;
    }
    private void addToy(){
        System.out.println("Enter color : ");
        String color = super.getStringInput();
        System.out.println("Enter Size : ");
        ToySize size = ToySize.valueOf(super.getStringInput().toUpperCase(Locale.ROOT));
        System.out.println("Enter The Name : ");
        String name = super.getStringInput();
        System.out.println("Enter Id : ");
        int id = super.getIntegerInput();
        Car car = new Car(color, size, name, id);

    }

    private void buyToy(){
        System.out.println("Enter Your id : ");
        int customerId = super.getIntegerInput();
        System.out.println("Enter Toy id You Want to Buy : ");
        int toyId = super.getIntegerInput();
        factory.buyToy(customerId, toyId);
    }

    private void showCustomersCart(){
        System.out.println("Enter Customer Id : ");
        factory.showCustomersCart(super.getIntegerInput());
    }

    private void printBudget(){
        System.out.println("Please Enter Customer Id : ");
        int id = super.getIntegerInput();

        boolean isEmpty = true;
        for (Customer customer : factory.getCustomers()) {
            if (customer.getId() == id){
                System.out.println("The Budget Is : " + customer.getBudget());
                isEmpty = false;
                break;
            }
        }
        if (isEmpty)
            System.out.println("\nThere is no Customer With This Id ...\n");
    }
}
