package ToyFactory;

import java.util.Random;

public class Toy {
    private String color;
    private final double basePrice = 10000;

    private double discountPrice;
    private ToySize size;
    private String name;
    private int id;

    public Toy(String color, ToySize size, String name, int id) {
        this.color = color;
        this.size = size;
        this.name = name;
        this.id = id;
        setDiscountPrice(size);
    }

    private void setDiscountPrice(ToySize size) {
        Random random = new Random();
        this.discountPrice = ((getBasePrice() * size.getCode()) * (100 - random.nextInt(101))) / 100;
    }


    @Override
    public String toString() {
        return "Toy { name : " + name +
                ", basePrice : " + basePrice + " ,ID : " + id + " }";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBasePrice() {
        return basePrice;
    }


    public double getDiscountPrice() {
        return discountPrice;
    }

    public ToySize getSize() {
        return size;
    }

    public void setSize(ToySize size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

