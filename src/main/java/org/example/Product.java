package org.example;

public class Product {

    private double price;
    private Category category;

    public Product(double price, Category category) {
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", category=" + category +
                '}';
    }
}
