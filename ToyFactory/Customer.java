package ToyFactory;

public class Customer {
    private int id;
    private String name;
    private String lastName;
    private double budget;
    private Cart cart;

    public Customer(int id, String name, String lastName, double budget) {
        cart = new Cart();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.budget = budget;
        Factory factory = new Factory();
        factory.addCustomer(this);
    }

    public void minesBudget(Car car) {
            budget -= car.getDiscountPrice();

    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
