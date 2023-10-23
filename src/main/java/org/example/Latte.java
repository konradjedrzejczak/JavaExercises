package org.example;

public class Latte extends CoffeMachine{
    @Override
    String getCoffeeType() {
        return CoffeType.LATTE.toString();
    }

    @Override
    public void brewCoffe(CoffeType coffeType) {
        System.out.println("Brewing coffe");
    }
}
