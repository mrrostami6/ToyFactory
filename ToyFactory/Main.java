package ToyFactory;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1234, "Arash", "Rostami", 100000);
        Customer customer2 = new Customer(1235, "Mohsen", "Rezayi", 50000);
        Customer customer3 = new Customer(1236, "Reza", "mirzayi", 20000);
        Customer customer4 = new Customer(1237, "Ali", "Hosseyni", 360000);
        Customer customer5 = new Customer(1238, "Hasan", "Fathi", 240000);

        boolean condition = true;
        Printer printer = new Printer();
        while (condition){
            Menu.showMenu();
            condition = printer.getMenuInput();
        }
    }
}
